package com.humorousz.kotlin.config.api;


import com.humorousz.kotlin.home.HomeItemModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  Created by zhangzhiquan on 2017/6/5.
 */

public class Api {

    public enum SECOND_MENU {
        /**
         * 主菜单
         */
        MAIN,
        /**
         * UI相关
         */
        UI,
        /**
         * 动画相关
         */
        ANIM,
        /**
         * 普通练习
         */
        OTHER
    }

    public static List<HomeItemModel> getList(SECOND_MENU type) {
        switch (type) {
            case UI:
                return getUI();
            case MAIN:
                return getAllItem();
            case ANIM:
                return getAnim();
            case OTHER:
                return getOther();
            default:
                break;
        }
        return null;

    }

    public static List<HomeItemModel> getAllItem() {
        List<HomeItemModel> models = new ArrayList<>(12);

        HomeItemModel itemModel;

        itemModel = new HomeItemModel();
        itemModel.setLink(TestProtocol.UI_MENU);
        itemModel.setTitle("UI相关");
        models.add(itemModel);

        itemModel = new HomeItemModel();
        itemModel.setLink(TestProtocol.ANIM_MENU);
        itemModel.setTitle("动画练习");
        models.add(itemModel);


        itemModel = new HomeItemModel();
        itemModel.setLink(TestProtocol.OTHER_MENU);
        itemModel.setTitle("练习");
        models.add(itemModel);

        return models;
    }


    public static List<HomeItemModel> getUI() {

        List<HomeItemModel> models = new ArrayList<>(12);
        HomeItemModel itemModel;

        itemModel = new HomeItemModel();
        itemModel.setLink(TestProtocol.TOPIC_RECYCLER_TEST);
        itemModel.setTitle("抖音新鲜页滑动渐变");
        models.add(itemModel);

        itemModel = new HomeItemModel();
        itemModel.setLink(TestProtocol.COORDINATOR_DEMO);
        itemModel.setTitle("上滑悬浮");
        models.add(itemModel);


        itemModel = new HomeItemModel();
        itemModel.setLink(TestProtocol.NESTED_TEST);
        itemModel.setTitle("NestedScrolling");
        models.add(itemModel);

        itemModel = new HomeItemModel();
        itemModel.setLink(TestProtocol.SHARE_ELEMENT);
        itemModel.setTitle("共享元素");
        models.add(itemModel);

        itemModel = new HomeItemModel();
        itemModel.setLink(TestProtocol.TEXT_SPAN);
        itemModel.setTitle("Span 练习");
        models.add(itemModel);

        itemModel = new HomeItemModel();
        itemModel.setLink(TestProtocol.COORDINATOR_TEST);
        itemModel.setTitle("Behavior练习");
        models.add(itemModel);

        itemModel = new HomeItemModel();
        itemModel.setLink(TestProtocol.COORDINATOR_ADVANCE);
        itemModel.setTitle("Coordinator练习");
        models.add(itemModel);


        itemModel = new HomeItemModel();
        itemModel.setLink(TestProtocol.NESTED_SCROLL_VIEW);
        itemModel.setTitle("NestedScrollView");
        models.add(itemModel);

        itemModel = new HomeItemModel();
        itemModel.setLink(TestProtocol.DRAWER_LAYOUT);
        itemModel.setTitle("DrawerLayout练习");
        models.add(itemModel);

        return models;
    }

    public static List<HomeItemModel> getAnim() {
        List<HomeItemModel> models = new ArrayList<>(12);
        HomeItemModel itemModel;

        itemModel = new HomeItemModel();
        itemModel.setLink(TestProtocol.FRAME_ANIMTOR);
        itemModel.setTitle("送礼");
        models.add(itemModel);

        itemModel = new HomeItemModel();
        itemModel.setLink(TestProtocol.SHADER);
        itemModel.setTitle("Shader练习");
        models.add(itemModel);

        itemModel = new HomeItemModel();
        itemModel.setLink(TestProtocol.VECTOR_DRAWABLE);
        itemModel.setTitle("属性动画");
        models.add(itemModel);

        itemModel = new HomeItemModel();
        itemModel.setLink(TestProtocol.ANT_TEST);
        itemModel.setTitle("芝麻信用效果");
        models.add(itemModel);
        return models;

    }

    public static List<HomeItemModel> getOther(){
        List<HomeItemModel> models = new ArrayList<>(12);
        HomeItemModel itemModel;
        itemModel = new HomeItemModel();
        itemModel.setLink(TestProtocol.DEMO_ROOM);
        itemModel.setTitle("demo房间");
        models.add(itemModel);

        itemModel = new HomeItemModel();
        itemModel.setLink(TestProtocol.DEMO_UI);
        itemModel.setTitle("demoUI");
        models.add(itemModel);

        itemModel = new HomeItemModel();
        itemModel.setLink(TestProtocol.RXJAVA);
        itemModel.setTitle("RxJava");
        models.add(itemModel);

        itemModel = new HomeItemModel();
        itemModel.setLink(TestProtocol.EXCEPTION_TEST);
        itemModel.setTitle("异常捕获器练习");
        models.add(itemModel);


        return models;
    }



}
