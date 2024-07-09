package com.myflavoradapter;

import android.app.Activity;
import android.content.Intent;


public abstract class MyFlavorAdapter {
    public abstract void onCreate(Activity activity);
    public  abstract void pay(String productId);
    public abstract String getUmengKey();
    public void checkLostPay(){}
    public abstract void exitgame();
    public void onPause(){}
    public void onResume(){}
    public void onDestroy(){}
    public void initsdk(){}
    public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data){}
}
