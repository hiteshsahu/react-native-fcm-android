/*
 *
 *   Copyright (c) 2017. HiteshSahu.com- All Rights Reserved
 *   Unauthorized copying of this file, via any medium is strictly prohibited
 *   Proprietary and confidential.
 *   Written by Hitesh Sahu <hiteshkrsahu@Gmail.com>, 2017.
 *
 *
 */

package com.hitesh_sahu.utils;

public class Config {
 
    // global topic to receive app wide push notifications
    public static final String TOPIC_GLOBAL = "global";
 
    // broadcast receiver intent filters
    public static final String REGISTRATION_COMPLETE = "registrationComplete";
    public static final String PUSH_NOTIFICATION = "pushNotification";
 
    // id to handle the notification in the notification tray
    public static final int NOTIFICATION_ID = 100;
    public static final int NOTIFICATION_ID_BIG_IMAGE = 101;
 
    public static final String SHARED_PREF = "ah_firebase";
}