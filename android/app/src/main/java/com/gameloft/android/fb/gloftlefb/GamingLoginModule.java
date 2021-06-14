package com.gameloft.android.fb.gloftlefb;

import android.util.Log;
import android.widget.Toast;

import com.facebook.FacebookSdk;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import  com.facebook.gamingservices.cloudgaming.*;

public class GamingLoginModule extends ReactContextBaseJavaModule {

    public GamingLoginModule(ReactApplicationContext context) {
        super(context);
    }

    @Override
    public String getName() {
        return "GamingLoginModule";
    }

    @ReactMethod
    public void Login() {
        Log.d("GamingLoginModule", "Login");

        FacebookSdk.setAutoInitEnabled(true);
        FacebookSdk.setAutoLogAppEventsEnabled(true);
        //FacebookSdk.sdkInitialize(getReactApplicationContext());
        FacebookSdk.fullyInitialize();
        CloudGameLoginHandler.init(getReactApplicationContext());
        Toast.makeText(getReactApplicationContext(),"GamingLoginModule Login",Toast.LENGTH_LONG).show();
    }
}

