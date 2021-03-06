package com.humorousz.kotlin.demo.common.util;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zhangzhiquan on 2017/5/30.
 */

public class UIUtils {
    private static final String TAG = "UIUtils";



    public static final int dip2px(Context context,int dip){
        float scale = context.getApplicationContext().getResources().getDisplayMetrics().density;
        return (int)((float)dip * scale + 0.5F);
    }

    public static final int getScreenWidth(Context context){
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics metrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(metrics);
        return metrics.widthPixels;
    }


    public static final int getScreenHeight(Context context){
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics metrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(metrics);
        return metrics.heightPixels;
    }

    /**
     * 按照中文占2个字符 英文占1个字符规则 获取字符串占位符
     *
     * @param source
     * @return
     */
    public static int getSpaceCount(String source) {
        int count = 0;
        count = source.length() + getSpaceChineseCount(source);
        return count;
    }

    /**
     * 获取中文个数
     *
     * @param source
     * @return
     */
    public static int getSpaceChineseCount(String source) {
        String regEx = "[\\u4e00-\\u9fa5]";
        int count = 0;
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(source);
        while (m.find()) {
            for (int i = 0; i <= m.groupCount(); i++) {
                count = count + 1;
            }
        }
        return count;
    }


}
