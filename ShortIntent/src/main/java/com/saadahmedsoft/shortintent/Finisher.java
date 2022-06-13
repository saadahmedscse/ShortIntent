package com.saadahmedsoft.shortintent;

import android.annotation.SuppressLint;
import android.app.Activity;

public class Finisher {

    @SuppressLint("StaticFieldLeak")
    volatile private static Finisher instance = null;

    /**
     * Get the instance of Finisher class
     *
     * @return Returns instance of Finisher class
     */

    public static Finisher getInstance() {
        if (instance == null) {
            instance = new Finisher();
        }
        return instance;
    }

    /**
     * Finish current activity
     *
     * @param activity is required to finish the current activity
     */

    public void finish(Activity activity) {
        activity.finish();
    }
}
