package com.example.android.background.sync;

import android.content.Context;

import com.example.android.background.utilities.PreferenceUtilities;

// DONE (1) Create a class called ReminderTasks
public class ReminderTasks{
    public static final String ACTION_INCREMENT_WATER_COUNT = "ACTION_INCREMENT_WATER_COUNT";

    public static void executeTask(Context context, String action){
        if(ACTION_INCREMENT_WATER_COUNT.equals(action)){
            incrementWaterCount(context);
        }
    }

    public static void incrementWaterCount(Context context){
        PreferenceUtilities.incrementWaterCount(context);
    }
}

// DONE (2) Create a public static constant String called ACTION_INCREMENT_WATER_COUNT

// DONE (6) Create a public static void method called executeTask
// DONE (7) Add a Context called context and String parameter called action to the parameter list

// DONE (8) If the action equals ACTION_INCREMENT_WATER_COUNT, call this class's incrementWaterCount

// DONE (3) Create a private static void method called incrementWaterCount
// DONE (4) Add a Context called context to the argument list
// DONE (5) From incrementWaterCount, call the PreferenceUtility method that will ultimately update the water count