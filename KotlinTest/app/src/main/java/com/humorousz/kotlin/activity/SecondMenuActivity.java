package com.humorousz.kotlin.activity;


import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;

import com.humorousz.kotlin.R;
import com.humorousz.kotlin.config.api.Api;
import com.humorousz.kotlin.demo.common.base.BaseActivity;
import com.humorousz.kotlin.demo.common.base.BaseFragment;
import com.humorousz.kotlin.home.HomeFragment;


/**
 * @author zhangzhiquan
 */
public class SecondMenuActivity extends BaseActivity {

    public static final String TYPE = "type";
    BaseFragment mFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_menu);
        Api.SECOND_MENU type = (Api.SECOND_MENU) getIntent().getSerializableExtra(TYPE);
        mFragment = HomeFragment.Companion.newInstance(type);
        FragmentTransaction tr = getSupportFragmentManager().beginTransaction();
        tr.add(R.id.second_menu_container,mFragment);
        tr.commit();
    }
}
