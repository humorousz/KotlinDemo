package com.humorousz.kotlin.demo.common.util

import android.content.Context
import android.widget.Toast

/**
 * Created by zhangzhiquan on 2018/3/25.
 */
object ToastUtil {
    private var mToast: Toast? = null
    @JvmStatic
    fun showToast(context: Context, msg: CharSequence) {
        showToast(context, msg, false)
    }
    @JvmStatic
    fun showToast(context: Context, msg: CharSequence, isLong: Boolean) {
        if (mToast != null) {
            mToast!!.cancel()
        }
        mToast = Toast.makeText(context, msg, if (isLong) Toast.LENGTH_LONG else Toast.LENGTH_SHORT)
        mToast!!.show()

    }
}