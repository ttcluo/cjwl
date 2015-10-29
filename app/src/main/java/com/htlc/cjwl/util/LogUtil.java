package com.htlc.cjwl.util;

import android.content.Context;
import android.util.Log;

/**
 * Created by Administrator on 2015/10/28.
 */
public class LogUtil {
    private static boolean isDebug = true;
    public static void i(String tag, String msg){
        if(isDebug){
            Log.i(tag,msg);
        }
    }
    public static void i(Object obj, String msg){
        if(isDebug){
            Log.i(obj.getClass().getSimpleName().toString(),msg);
        }
    }
}
