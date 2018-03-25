package com.humorousz.kotlin.home

/**
 * Created by zhangzhiquan on 2018/3/25.
 */
class HomeItemModel{
    private var title:String? = null
    private var link: String? = null
    fun getTitle() = title
    fun getLink()=link
    fun setTitle(title:String?){
        this.title = title
    }
    fun setLink(link:String?){
        this.link = link
    }
}