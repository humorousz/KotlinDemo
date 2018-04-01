package com.humorousz.kotlin.config.router

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.text.TextUtils
import com.humorousz.kotlin.activity.ContainerActivity
import com.humorousz.kotlin.activity.SecondMenuActivity
import com.humorousz.kotlin.config.api.Api
import com.humorousz.kotlin.config.api.TestProtocol
import com.humorousz.kotlin.config.factory.TestFragmentFactory
import com.humorousz.kotlin.demo.common.util.Logger

/**
 * @author zhangzhiquan
 * @date 2018/4/1
 */
class RouterKt {
    companion object {
        private const val TAG : String = "Router"
        fun jumpTo(context: Context?,link:String?){
            var startTime:Long = System.currentTimeMillis()
            Logger.i(TAG,"jumpTo begin")
            if(TextUtils.isEmpty(link) || link == null ){
                return
            }
            try {
                val uri = Uri.parse(link)
                val typeString = uri.getQueryParameter("type")
                if(link.contains(TestProtocol.MENU)){
                    val type = Api.SECOND_MENU.valueOf(typeString)
                    startMenuActivity(context,type)
                }else{
                    val type = TestFragmentFactory.TYPE.valueOf(typeString)
                    val hasTitle = java.lang.Boolean.valueOf(uri.getQueryParameter("hasTitle"))?:false
                    val landscape = uri.getBooleanQueryParameter("couldLandscape", false)
                    startActivity(context, hasTitle, landscape, type)
                }

            }catch (e:RuntimeException ){
                Logger.e(TAG,e.message)
            }
            Logger.i(TAG, "jumpTo end spend " + (System.currentTimeMillis() - startTime))
        }

        private fun startActivity(context: Context?, hasTitle: Boolean, landscape: Boolean, type: TestFragmentFactory.TYPE) {
            if (context == null) {
                Logger.e(TAG, "context must not be null")
                return
            }
            val intent = Intent(context, ContainerActivity::class.java)
            intent.putExtra(ContainerActivity.HAS_TITLE, hasTitle)
            intent.putExtra(ContainerActivity.FRAGMENT_TYPE, type)
            intent.putExtra(ContainerActivity.LANDSCAPE, landscape)

            context.startActivity(intent)
        }

        private fun startMenuActivity(context: Context?, type: Api.SECOND_MENU) {
            if (context == null) {
                Logger.e(TAG, "context must not be null")
                return
            }
            val intent = Intent(context, SecondMenuActivity::class.java)
            intent.putExtra(SecondMenuActivity.TYPE, type)
            context.startActivity(intent)
        }
    }
}