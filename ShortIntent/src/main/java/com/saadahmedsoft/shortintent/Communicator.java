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
     * Get String value Set from ShortIntent at 'key'.
     *
     * @param key intent key
     * @return String value at 'key'
     */

    public String getStringExtra(String key) {
        return intent.getStringExtra(key);
    }

    /**
     * Get Integer value Set from ShortIntent at 'key'. If key not found, return 'defaultValue'
     *
     * @param key          ShortIntent key
     * @param defaultValue ShortIntent defaultValue
     * @return Integer value at 'key' or 'defaultValue' if key not found
     */

    public int getIntExtra(String key, int defaultValue) {
        return intent.getIntExtra(key, defaultValue);
    }

    /**
     * Get Boolean value Set from ShortIntent at 'key'. If key not found, return 'defaultValue'
     *
     * @param key          ShortIntent key
     * @param defaultValue ShortIntent defaultValue
     * @return Boolean value at 'key' or 'defaultValue' if key not found
     */

    public Boolean getBooleanExtra(String key, boolean defaultValue) {
        return intent.getBooleanExtra(key, defaultValue);
    }

    /**
     * Get Short value Set from ShortIntent at 'key'. If key not found, return 'defaultValue'
     *
     * @param key          ShortIntent key
     * @param defaultValue ShortIntent defaultValue
     * @return Short value at 'key' or 'defaultValue' if key not found
     */

    public Short getShortExtra(String key, short defaultValue) {
        return intent.getShortExtra(key, defaultValue);
    }

    /**
     * Get Long value Set from ShortIntent at 'key'. If key not found, return 'defaultValue'
     *
     * @param key          ShortIntent key
     * @param defaultValue ShortIntent defaultValue
     * @return Long value at 'key' or 'defaultValue' if key not found
     */

    public Long getLongExtra(String key, long defaultValue) {
        return intent.getLongExtra(key, defaultValue);
    }

    /**
     * Get Double value Set from ShortIntent at 'key'. If key not found, return 'defaultValue'
     *
     * @param key          ShortIntent key
     * @param defaultValue ShortIntent defaultValue
     * @return Double value at 'key' or 'defaultValue' if key not found
     */

    public Double getDoubleExtra(String key, double defaultValue) {
        return intent.getDoubleExtra(key, defaultValue);
    }

    /**
     * Get Object Set from ShortIntent at 'key'.
     *
     * @param key ShortIntent key
     * @return Object at 'key'
     */

    @SuppressWarnings("unchecked")
    public <T> T getObject(String key, Class<?> objectType) {
        Gson gson = new Gson();
        return (T) gson.fromJson(intent.getStringExtra(key), objectType);
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

