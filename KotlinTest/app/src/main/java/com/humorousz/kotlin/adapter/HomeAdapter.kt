package com.humorousz.kotlin.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.humorousz.kotlin.R
import com.humorousz.kotlin.config.router.RouterKt
import com.humorousz.kotlin.home.HomeItemModel

/**
 * Created by zhangzhiquan on 2018/3/25.
 */
class HomeAdapter(private val mContext:Context,private val mList:List<HomeItemModel>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(),HomeHolder.OnItemClickListener{
    override fun onItemClick(position: Int) {
        val link = mList[position].getLink()
        RouterKt.jumpTo(mContext, link)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        var view  = LayoutInflater.from(mContext).inflate(R.layout.layout_home_fragment_item,parent,false)
        return HomeHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
       if(holder is HomeHolder){
           holder.bindData(mList.get(position).getTitle(),position)
       }
    }

    override fun getItemCount(): Int = mList.size

}