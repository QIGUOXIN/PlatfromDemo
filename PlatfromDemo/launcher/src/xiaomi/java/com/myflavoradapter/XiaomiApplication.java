package com.myflavoradapter;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;
import com.unity3d.player.BuildConfig;



public class XiaomiApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        UMConfigure.init(this, BuildConfig.RATE_UMENG,BuildConfig.FLAVOR + BuildConfig.RATE_APPNAME, UMConfigure.DEVICE_TYPE_PHONE,null);
    }


}
