package com.myflavoradapter;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.ViewGroup;

import com.umeng.analytics.MobclickAgent;


import static android.content.Context.MODE_PRIVATE;


public class ZYFlavorAdapterCommondebug extends ZYFlavorAdapter {

    private Activity _activity;
    private String buyId;
    ViewGroup viewGroup;
    //private AQuery mAQuery;
    private boolean ishavevideo = false;
    static final String TAG = "Qq";
    public int click = 0;
    static public boolean isShowfinsh = true;

    @Override
    public void onCreate(final Activity activity) {
        _activity = activity;


//        viewGroup = (ViewGroup) LayoutInflater.from(_activity).inflate(R.layout.activity_native_intertitial, null);
//        _activity.addContentView(viewGroup, new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT));
//        viewGroup.setVisibility(View.INVISIBLE);
        int first = getIntValue(activity, "firstLogin", "first", 1);
        if (first == 0) {
            sdkDoLoign();
        }

    }

    private static int getIntValue(Context activity, String spName, String key, int defValue) {
        SharedPreferences sp = activity.getSharedPreferences(spName,
                MODE_PRIVATE);
        return sp.getInt(key, defValue);
    }

    public void initsdk() {
    }

    //////////////////////////////////////////聚合SDK//////////////////////////////////////////////
    public void sdkDoLoign() {

    }

    public void ZYADInit() {
    }

    @Override
    public void Agreement(boolean Agreement) {
    }

    @Override
    public void pay(String productId) {
    }

    @Override
    public void initZYAG() {

    }

    @Override
    public void showBanner() {
        //ZYAGInitializer.showBannner("banner");
    }

    @Override
    public void hideBanner() {
        //ZYAGInitializer.hideBanner("banner");
    }

    @Override
    public void showDelayInterstitialAd() {
        //ZYAGInitializer.showInterstitial("插屏");
    }

    @Override
    public void showInterstitialAd() {
        //ZYAGInitializer.showInterstitial("插屏");
    }

    @Override
    public String getZYKey() {
        return "";
    }

    @Override
    public String getUmengChannel() {
        return "";
    }

    @Override
    public String getUmengKey() {
        return "";
    }

    @Override
    public void ShowVideo() {
    }
    @Override
    public boolean ishaveVideo() {
       // return ZYAGInitializer.isVideoAvalible("视频");
        return true;
    }

    /////////////////////////////////////返回键退出游戏////////////////////////////////////////
    @Override
    public void exitgame() {
    }


    public void onBackPressed() {
        //   ZYAGInitializer.videoOnBackPressed("视频");
    }

    @Override
    public void onPause() {
        // ZYAGInitializer.videoOnPause("视频");
        MobclickAgent.onPause(_activity);
    }

    @Override
    public void onResume() {
        // ZYAGInitializer.videoOnResume("视频");
        MobclickAgent.onResume(_activity);
    }


    public void loadNativeInterstitialAd() {

    }

    private void showAD() {


    }

    private int dp2px(float dpValue) {
        final float scale = _activity.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }


    @Override
    public void initZYAGPlatforms(final Activity activity) {

    }
}
