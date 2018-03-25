package com.humorousz.kotlin.demo.common.util

import android.util.Log

/**
 * Created by zhangzhiquan on 2018/3/25.
 */
 object Logger{
    @JvmStatic
    fun d(tag:String?,msg:String?){
        Log.d(tag,msg)
    }
    @JvmStatic
    fun i(tag:String?,msg:String?){
        Log.i(tag,msg)
    }
    @JvmStatic
    fun e(tag:String?,msg:String?){
        Log.e(tag,msg)
    }
}