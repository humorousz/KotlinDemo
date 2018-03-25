package com.humorousz.kotlin.demo.common.base

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

open abstract class BaseFragment : Fragment() {
    /**
     * 标志位，标志fragment已经初始化完成
     */
    private var prepared: Boolean = false
    /**
     * 标志位，是否执行了init
     */
    private var init = false

    private var firstVisible = true
    private var firstInvisible = true
    private var destroyView = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = createView(inflater, container, savedInstanceState)
        initView(view)
        return view
    }

    abstract fun createView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View
    abstract fun initView(root: View)
    fun getLogTitle(): String? {
        return null
    }

    fun getTitle(): String? {
        return null
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)

    }

    override fun onDetach() {
        super.onDetach()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        destroyView = true
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
        super.setUserVisibleHint(isVisibleToUser)
        if (isVisibleToUser) {
            if (firstVisible) {
                firstVisible = false
                initPrepare()
            } else {
                onVisible()
            }
        } else {
            if (firstInvisible) {
                firstInvisible = false
                onFirstInvisible()
            } else {
                onInVisible()
            }
        }
    }

    @Synchronized
    private fun initPrepare() {
        if (prepared) {
            init = true
            onFirstVisible()
        }
    }

    /**
     * 设置初始化完成标志
     * @param prepared
     */
    protected fun setPrepared(prepared: Boolean?) {
       if(prepared != null){
           this.prepared = prepared
       }
    }


    protected fun onVisible() {

    }

    protected fun onInVisible() {

    }

    protected fun onFirstVisible() {

    }

    protected fun onFirstInvisible() {

    }


}
