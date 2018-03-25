package com.humorousz.kotlin.demo.common.util

import android.app.Activity
import android.os.Build
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.view.WindowManager

/**
 * Created by zhangzhiquan on 2018/3/25.
 */
object StatusBarCompat{
    fun compat(activity:Activity,color:Int){
        if(Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP){
            return
        }
        val window = activity.window
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        //需要设置这个 flag 才能调用 setStatusBar Color 来设置状态栏颜色
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = color
        val mContentView = activity.findViewById<ViewGroup>(Window.ID_ANDROID_CONTENT)
        val mChildView = mContentView.getChildAt(0)
        if (mChildView != null) {
            //注意不是设置 ContentView 的 FitsSystemWindows, 而是设置 ContentView 的第一个子 View . 使其不为系统 View 预留空间.
            mChildView.fitsSystemWindows = true
        }
        //修改状态栏文字颜色
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            activity.window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        }
    }
}