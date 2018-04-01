package com.humorousz.kotlin.activity

import android.os.Bundle
import android.widget.FrameLayout
import com.humorousz.kotlin.R
import com.humorousz.kotlin.config.api.Api
import com.humorousz.kotlin.demo.common.base.BaseActivity
import com.humorousz.kotlin.demo.common.base.BaseFragment
import com.humorousz.kotlin.home.HomeFragment

class MainActivity : BaseActivity() {
    private val TAG:String = "MainActivity"
    private var mFragment:BaseFragment?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()
        mFragment = HomeFragment.newInstance(Api.SECOND_MENU.MAIN)
        val tr = supportFragmentManager.beginTransaction()
        tr.add(R.id.container, mFragment)
        tr.commit()
    }

}
