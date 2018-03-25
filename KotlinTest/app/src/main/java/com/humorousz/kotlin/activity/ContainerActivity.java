package com.humorousz.kotlin.activity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.humorousz.kotlin.R;
import com.humorousz.kotlin.config.factory.TestFragmentFactory;
import com.humorousz.kotlin.demo.common.base.BaseActivity;
import com.humorousz.kotlin.demo.common.base.BaseFragment;
import com.humorousz.kotlin.demo.common.util.Logger;
import com.humorousz.kotlin.demo.common.util.ToastUtil;


/**
 * @author zhangzhiquan
 */

public class ContainerActivity extends BaseActivity {
    private static final String TAG = "ContainerActivity";
    public static final String HAS_TITLE = "hasTitle";
    public static final String FRAGMENT_TYPE = "type";
    public static final String LANDSCAPE = "landscape";
    FrameLayout mContainer;
    BaseFragment mFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if(savedInstanceState != null){
            String FRAGMENTS_TAG = "android:support:fragments";
            savedInstanceState.remove(FRAGMENTS_TAG);
        }
        Boolean land = getIntent().getBooleanExtra(LANDSCAPE,false);
        if(!land){
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
        super.onCreate(savedInstanceState);
        boolean hasTitle = getIntent().getBooleanExtra(HAS_TITLE,true);
        TestFragmentFactory.TYPE type = (TestFragmentFactory.TYPE) getIntent().getSerializableExtra(FRAGMENT_TYPE);
        if(type == null){
            ToastUtil.showToast(this,"no fragment type");
            finish();
        }
        setContentView(R.layout.activity_container);
        if(!hasTitle){
            Logger.d(TAG,"no title");
            getSupportActionBar().hide();
        }
        mFragment = TestFragmentFactory.createFragment(type);
        mContainer = (FrameLayout) findViewById(R.id.test_container);
        FragmentTransaction tr = getSupportFragmentManager().beginTransaction();
        tr.add(R.id.test_container,mFragment);
        tr.commit();
    }
}
