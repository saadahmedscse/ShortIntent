package com.saadahmedsoft.shortintent;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ShortIntent {

    /**
     * Custom Intent class.
     * Made by Saad Ahmed on 16-May-2022.
     * This class has been made to simplify the built-in Intent class.
     * Animate between two activites.
     */

    private final Activity activity;

    private ShortIntent(Activity activity) {
        this.activity = activity;
    }

    @SuppressLint("StaticFieldLeak")
    volatile private static ShortIntent instance = null;

    public static ShortIntent getInstance(Activity activity) {
        if (instance == null) {
            instance = new ShortIntent(activity);
        }
        return instance;
    }

    public Communicator addDestination(Class<?> destination) {
        Intent intent = new Intent(activity, destination);
        activity.startActivity(intent);
        return Communicator.getInstance(intent, activity);
    }
}
