package com.humorousz.kotlin.demo.common.base

import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.support.v7.app.AppCompatActivity
import com.humorousz.kotlin.demo.common.util.StatusBarCompat

open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        if(savedInstanceState != null){
            val tag = "android:support:fragments"
            savedInstanceState.remove(tag)
        }
        super.onCreate(savedInstanceState)
        StatusBarCompat.compat(this,Color.TRANSPARENT);
    }
}
