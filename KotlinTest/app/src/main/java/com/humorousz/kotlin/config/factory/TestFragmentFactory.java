package com.humorousz.kotlin.config.factory;


import com.humorousz.kotlin.demo.common.base.BaseFragment;

/**
 * Created by zhangzhiquan on 2017/6/5.
 * @author zhangzhiquan
 */

public class TestFragmentFactory {
    public enum TYPE{
        ANT,
        COORDINATOR,
        TOPIC_RECYCLER,
        TEST_COORDINATOR,
        ADVANCE_COORDINATOR,
        NESTED_SCROLLING,
        NESTED_SCROLL_VIEW,
        EXCEPTION,
        DRAWER_LAYOUT,
        FRAME_ANIMTOR,
        DEMO_ROOM,
        TEXT_SPAN,
        DEMO_UI,
        VECTOR_DRAWABLE,
        SHARE_ELEMENT,
        SHARE_ELEMENT_B,
        SHADER,
        RXJAVA
    }
    public static BaseFragment createFragment(TYPE type){
        BaseFragment fragment = null;
        switch (type){
            case ANT:
//                fragment = new AntFragment();
                break;
            case COORDINATOR:
//                fragment = new CoordinatorFragment();
                break;
            case TOPIC_RECYCLER:
//                fragment = new TestRecyclerFragment();
                break;
            case TEST_COORDINATOR:
//                fragment = new TestCoordinatorFragment();
                break;
            case ADVANCE_COORDINATOR:
//                fragment = new AdvancedCoordinatorFragment();
                break;
            case NESTED_SCROLLING:
//                fragment = new TestNestedFragment();
                break;
            case NESTED_SCROLL_VIEW:
//                fragment = new NestScrollViewFragment();
                break;
            case EXCEPTION:
//                fragment = new UncaughtExceptionFragment();
                break;
            case DRAWER_LAYOUT:
//                fragment = new DrawerLayoutFragment();
                break;
            case FRAME_ANIMTOR:
//                fragment = new AnimatorFragment();
                break;
            case DEMO_ROOM:
//                fragment = new DemoRoomFragment();
                break;
            case TEXT_SPAN:
//                fragment = new TextSpanFragment();
                break;
            case DEMO_UI:
//                fragment = new DemoUIFragment();
                break;
            case VECTOR_DRAWABLE:
//                fragment = new VectorTestFragment();
                break;
            case SHARE_ELEMENT:
//                fragment = new ShareElementFragmentA();
                break;
            case SHARE_ELEMENT_B:
//                fragment = new ShareElementFragmentB();
                break;
            case SHADER:
//                fragment = new ShaderTestFragment();
                break;
            case RXJAVA:
//                fragment = new RxTestFragment();
                break;
            default:
                break;
        }
        return fragment;
    }

}
