package com.gameloft.android.fb.gloftlefb;

import android.util.Log;

import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.gamingservices.cloudgaming.CloudGameLoginHandler;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class GamingLoginModule extends ReactContextBaseJavaModule {

    public GamingLoginModule(ReactApplicationContext context) {
        super(context);
    }

    @Override
    public String getName() {
        return "GamingLoginModule";
    }

    @ReactMethod
    public void Login(Callback successCallBack, Callback failCallBack) {
        Log.d("GamingLoginModule", "Login");
        try {
            FacebookSdk.fullyInitialize();
            CloudGameLoginHandler.init(getReactApplicationContext());
            successCallBack.invoke("Login success");
        } catch (Exception ex) {
            failCallBack.invoke("Login Fail: " + ex.getMessage());
        }
    }

    @ReactMethod
    public void getAccessToken(Callback successCallBack, Callback failCallBack) {
        Log.d("GamingLoginModule", "getAccessToken");
        try {
            AccessToken dta = AccessToken.getCurrentAccessToken();
            successCallBack.invoke(dta.toString());

        } catch (Exception ex) {
            failCallBack.invoke("Fail to get AccessToken");
        }
    }
}

