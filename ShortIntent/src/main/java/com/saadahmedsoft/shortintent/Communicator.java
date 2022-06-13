package com.saadahmedsoft.shortintent;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.google.gson.Gson;

public class Communicator {

    @SuppressLint("StaticFieldLeak")
    volatile private static Communicator instance = null;
    private final Intent intent;
    private final Activity activity;

    private Communicator(Intent intent, Activity activity) {
        this.intent = intent;
        this.activity = activity;
    }

    /**
     * Activity and Intent is required to get the instance of Communicator class
     *
     * @param activity Intent from the activity
     * @param intent   Intent from the ShortIntent
     * @return Returns instance of Communicator class
     */

    public static Communicator getInstance(Intent intent, Activity activity) {
        if (instance == null) {
            instance = new Communicator(intent, activity);
        }
        return instance;
    }

    /**
     * Put String value into ShortIntent with 'key'
     *
     * @param key   ShortIntent key
     * @param value String value to be added
     * @return Returns singletone instance of Communicator class
     */

    public Communicator putExtra(String key, String value) {
        intent.putExtra(key, value);
        return instance;
    }

    /**
     * Put Integer value into ShortIntent with 'key'
     *
     * @param key   ShortIntent key
     * @param value Integer value to be added
     * @return Returns singletone instance of Communicator class
     */

    public Communicator putExtra(String key, int value) {
        intent.putExtra(key, value);
        return instance;
    }

    /**
     * Put Boolean value into ShortIntent with 'key'
     *
     * @param key   ShortIntent key
     * @param value Boolean value to be added
     * @return Returns singletone instance of Communicator class
     */

    public Communicator putExtra(String key, boolean value) {
        intent.putExtra(key, value);
        return instance;
    }

    /**
     * Put Short value into ShortIntent with 'key'
     *
     * @param key   ShortIntent key
     * @param value Short value to be added
     * @return Returns singletone instance of Communicator class
     */

    public Communicator putExtra(String key, short value) {
        intent.putExtra(key, value);
        return instance;
    }

    /**
     * Put Long value into ShortIntent with 'key'
     *
     * @param key   ShortIntent key
     * @param value Long value to be added
     * @return Returns singletone instance of Communicator class
     */

    public Communicator putExtra(String key, long value) {
        intent.putExtra(key, value);
        return instance;
    }

    /**
     * Put Double value into ShortIntent with 'key'
     *
     * @param key   ShortIntent key
     * @param value Double value to be added
     * @return Returns singletone instance of Communicator class
     */

    public Communicator putExtra(String key, double value) {
        intent.putExtra(key, value);
        return instance;
    }

    /**
     * Put Bundle into ShortIntent with 'key'
     *
     * @param key   ShortIntent key
     * @param value Bundle to be added
     * @return Returns singletone instance of Communicator class
     */

    public Communicator putExtra(String key, Bundle value) {
        intent.putExtra(key, value);
        return instance;
    }

    /**
     * Put Object into ShortIntent with 'key'
     *
     * @param key    ShortIntent key
     * @param object Object to be added
     * @return Returns singletone instance of Communicator class
     */

    public Communicator putExtra(String key, Object object) {
        Gson gson = new Gson();
        intent.putExtra(key, gson.toJson(object));
        return instance;
    }

    /**
     * Add transition of activity intent
     *
     * @param anim Anim transition enum
     * @return instance of Finisher class
     */

    public Finisher addTransition(Anim anim) {
        switch (anim) {
            case ZOOM: {
                Animator.animateZoom(activity);
                break;
            }
            case FADE: {
                Animator.animateFade(activity);
                break;
            }
            case WINDMILL: {
                Animator.animateWindmill(activity);
                break;
            }
            case SPIN: {
                Animator.animateSpin(activity);
                break;
            }
            case DIAGONAL: {
                Animator.animateDiagonal(activity);
                break;
            }
            case SPLIT: {
                Animator.animateSplit(activity);
                break;
            }
            case SHRINK: {
                Animator.animateShrink(activity);
                break;
            }
            case CARD: {
                Animator.animateCard(activity);
                break;
            }
            case INOUT: {
                Animator.animateInAndOut(activity);
                break;
            }
            case SWIPELEFT: {
                Animator.animateSwipeLeft(activity);
                break;
            }
            case SWIPRIGHT: {
                Animator.animateSwipeRight(activity);
                break;
            }
            case SLIDELEFT: {
                Animator.animateSlideLeft(activity);
                break;
            }
            case SLIDERIGHT: {
                Animator.animateSlideRight(activity);
                break;
            }
            case SLIDEDOWN: {
                Animator.animateSlideDown(activity);
                break;
            }
            case SLIDEUP: {
                Animator.animateSlideUp(activity);
                break;
            }
        }
        return Finisher.getInstance();
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

