package com.hitesh_sahu.modules;

import android.support.annotation.Nullable;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;

/**
 * Created by hitesh.sahu on 7/17/2017.
 */

public class FCMModule extends ReactContextBaseJavaModule {
    private static final String TAG = FCMModule.class.getSimpleName();
    private final ReactApplicationContext reactAppContext;

    @Override
    public String getName() {
        return TAG;
    }

    public FCMModule(ReactApplicationContext reactAppContext) {
        super(reactAppContext);
        this.reactAppContext = reactAppContext;
    }

    private void sendEvent(ReactContext reactContext,
                           String eventName,
                           @Nullable WritableMap params) {

    }

    /**
     * Get all songs from SD card
     *
     * @param errorCallback
     * @param successCallback
     */
    @ReactMethod
    public void doSomething(Callback errorCallback,
                            Callback successCallback) {


// errorCallback.invoke("There are no Audio Files Found on This Device");

// successCallback.invoke(new Gson().toJson(Object));
    }

    private void sendEvent() {

//        //Update UI with next SOng Info
//        WritableMap paramsUI = Arguments.createMap();
//        paramsUI.putString(KEY_UPDATE_SONG_NAME, getSongName());
//        paramsUI.putInt(KEY_UPDATE_SEEK_POSTION,getProgress());
//        sendEvent(reactAppContext, EVENT_SONG_CHANGED, paramsUI);

    }


}
