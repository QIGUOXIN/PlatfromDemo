package com.myflavoradapter;

import android.app.Activity;



public class MyFlavorAdapterHuawei extends MyFlavorAdapter {
    static String TAG = "YY";
    Activity activity;
    private int ConsumptionNum = 2;
    private String buyId;
    @Override
    public void onCreate(Activity _activity) {
        activity = _activity;



    }

    @Override
    public void pay(String productId) {

    }


    @Override
    public String getUmengKey() {
        return null;
    }

    @Override
    public void exitgame() {

    }

    public void sdkDoLoign()
    {

    }


}
