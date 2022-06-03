package com.saadahmedsoft.shortintent;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;

public class ShortIntent {

    /**
     * Custom Intent class.
     * Made by Saad Ahmed on 16-May-2022.
     * This class has been made to simplify the built-in Intent class.
     * Animate between two activites.
     */

    private final Activity activity;
    private Intent intent;

    private ShortIntent(Activity activity) {
        this.activity = activity;
    }

    @SuppressLint("StaticFieldLeak")
    private static ShortIntent instance = null;

    public static ShortIntent getInstance(Activity activity) {
        if (instance == null) {
            instance = new ShortIntent(activity);
        }
        return instance;
    }

    public ShortIntent addDestination(Class destination) {
        intent = new Intent(activity, destination);
        activity.startActivity(intent);
        return instance;
    }

    public ShortIntent putExtra(String key, String value) {
        intent.putExtra(key, value);
        return instance;
    }

    public ShortIntent putExtra(String key, int value) {
        intent.putExtra(key, value);
        return instance;
    }

    public ShortIntent putExtra(String key, boolean value) {
        intent.putExtra(key, value);
        return instance;
    }

    public ShortIntent putExtra(String key, short value) {
        intent.putExtra(key, value);
        return instance;
    }

    public ShortIntent putExtra(String key, long value) {
        intent.putExtra(key, value);
        return instance;
    }

    public ShortIntent putExtra(String key, double value) {
        intent.putExtra(key, value);
        return instance;
    }

    public ShortIntent putExtras(String key, Bundle value) {
        intent.putExtra(key, value);
        return instance;
    }

    public String getStringExtra(String key) {
        return intent.getStringExtra(key);
    }

    public int getIntExtra(String key, int defaultValue) {
        return intent.getIntExtra(key, defaultValue);
    }

    public Boolean getBooleanExtra(String key, boolean defaultValue) {
        return intent.getBooleanExtra(key, defaultValue);
    }

    public Short getShortExtra(String key, short defaultValue) {
        return intent.getShortExtra(key, defaultValue);
    }

    public Long getLongExtra(String key, long defaultValue) {
        return intent.getLongExtra(key, defaultValue);
    }

    public Double getDoubleExtra(String key, double defaultValue) {
        return intent.getDoubleExtra(key, defaultValue);
    }

    public void finish(@NonNull Activity activity) {
        activity.finish();
    }

    public ShortIntent addTransition(@NonNull Anim anim) {
        switch (anim) {
            case ZOOM: { Animator.animateZoom(activity); break; }
            case FADE : { Animator.animateFade(activity); break; }
            case WINDMILL : { Animator.animateWindmill(activity); break; }
            case SPIN : { Animator.animateSpin(activity); break; }
            case DIAGONAL : { Animator.animateDiagonal(activity); break; }
            case SPLIT : { Animator.animateSplit(activity); break; }
            case SHRINK : { Animator.animateShrink(activity); break; }
            case CARD : { Animator.animateCard(activity); break; }
            case INOUT : { Animator.animateInAndOut(activity); break; }
            case SWIPELEFT : { Animator.animateSwipeLeft(activity); break; }
            case SWIPRIGHT : { Animator.animateSwipeRight(activity); break; }
            case SLIDELEFT : { Animator.animateSlideLeft(activity); break; }
            case SLIDERIGHT : { Animator.animateSlideRight(activity); break; }
            case SLIDEDOWN : { Animator.animateSlideDown(activity); break; }
            case SLIDEUP : { Animator.animateSlideUp(activity); break; }
        }
        return instance;
    }
}
