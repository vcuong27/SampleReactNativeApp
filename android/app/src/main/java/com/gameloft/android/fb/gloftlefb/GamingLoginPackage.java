package com.gameloft.android.fb.gloftlefb;

import androidx.annotation.NonNull;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class GamingLoginPackage implements ReactPackage {

    @Override
    public List<NativeModule> createNativeModules( ReactApplicationContext reactContext) {
        List<NativeModule> lts= new ArrayList<>();
        lts.add(new GamingLoginModule(reactContext));
        return lts;
    }

    @Override
    public List<ViewManager> createViewManagers( ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }
}
