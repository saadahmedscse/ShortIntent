package com.saadahmedsoft.shortintent;

import android.annotation.SuppressLint;
import android.app.Activity;

public class Finisher {

    @SuppressLint("StaticFieldLeak")
    volatile private static Finisher instance = null;

    public static Finisher getInstance() {
        if (instance == null) {
            instance = new Finisher();
        }
        return instance;
    }

    public void finish(Activity activity) {
        activity.finish();
    }
}
