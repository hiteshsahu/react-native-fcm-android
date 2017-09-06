/*
 *
 *   Copyright (c) 2017. HiteshSahu.com- All Rights Reserved
 *   Unauthorized copying of this file, via any medium is strictly prohibited
 *   Proprietary and confidential.
 *   Written by Hitesh Sahu <hiteshkrsahu@Gmail.com>, 2017.
 *
 *
 */

package com.hitesh_sahu.modules;

import android.support.annotation.Nullable;
import android.widget.Toast;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;

import static com.hitesh_sahu.utils.AppConstants.ENABLE_NOTIFICATION;
import static com.hitesh_sahu.utils.PreferenceHelper.getPrefernceHelperInstace;

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

    /**
     * Toggle Notification Setting
     *
     * @param showNotifcation
     */
    @ReactMethod
    public void toggleNotification(boolean showNotifcation) {

        if (showNotifcation) {
            Toast.makeText(reactAppContext, "Notification Enabled", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(reactAppContext, "Notification Disabled", Toast.LENGTH_SHORT).show();
        }
        getPrefernceHelperInstace().setBoolean(reactAppContext, ENABLE_NOTIFICATION, showNotifcation);
    }

    /**
     * Check if Notification is Enabled
     *
     * @param successCallbackUserSettings
     */
    @ReactMethod
    public void isNotificationEnabled(Callback successCallbackUserSettings) {

        successCallbackUserSettings.invoke(getPrefernceHelperInstace().getBoolean(reactAppContext,
                ENABLE_NOTIFICATION, true));
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
