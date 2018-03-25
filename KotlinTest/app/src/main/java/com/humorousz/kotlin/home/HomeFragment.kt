package com.humorousz.kotlin.home

import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.StaggeredGridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.humorousz.kotlin.adapter.HomeAdapter
import com.humorousz.kotlin.R
import com.humorousz.kotlin.config.api.Api
import com.humorousz.kotlin.demo.common.base.BaseFragment
import com.humorousz.kotlin.demo.common.widget.GridItemDecoration


/**
 * @author Created by zhangzhiquan on 2017/6/4.
 */

class HomeFragment : BaseFragment() {
    private var mRecyclerView: RecyclerView? = null
    private var type: Api.SECOND_MENU? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        type = arguments.getSerializable("type") as Api.SECOND_MENU
    }

    override fun createView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater!!.inflate(R.layout.layout_home_fragment, container, false)
    }

    override fun initView(root: View) {
        mRecyclerView = root.findViewById(R.id.recycler_home)
        mRecyclerView!!.adapter = HomeAdapter(context, Api.getList(type))
        mRecyclerView!!.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        mRecyclerView!!.addItemDecoration(GridItemDecoration(context))
    }


    companion object {
        private val TAG = "HomeFragment"

        fun newInstance(type: Api.SECOND_MENU): HomeFragment {

            val args = Bundle()
            args.putSerializable("type", type)
            val fragment = HomeFragment()
            fragment.arguments = args
            return fragment
        }
    }

}

