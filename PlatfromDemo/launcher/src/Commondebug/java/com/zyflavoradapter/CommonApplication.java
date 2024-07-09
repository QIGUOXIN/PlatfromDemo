package com.myflavoradapter;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;


import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;
import com.unity3d.player.UnityPlayerActivity;


public class CommonApplication extends Application {

    static MyFlavorAdapter flavorAdapter;

    @Override
    public void onCreate() {
        super.onCreate();
    }
    private static int getIntValue(Context activity, String spName, String key, int defValue) {
        SharedPreferences sp = activity.getSharedPreferences(spName,
                MODE_PRIVATE);
        return sp.getInt(key,defValue);
    }
}
