package com.saadahmedsoft.shortintent;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Communicator {

    @SuppressLint("StaticFieldLeak")
    volatile private static Communicator instance = null;
    private final Intent intent;
    private final Activity activity;

    private Communicator(Intent intent, Activity activity) {
        this.intent = intent;
        this.activity = activity;
    }

    public static Communicator getInstance(Intent intent, Activity activity) {
        if (instance == null) {
            instance = new Communicator(intent, activity);
        }
        return instance;
    }

    public Communicator putExtra(String key, String value) {
        intent.putExtra(key, value);
        return instance;
    }

    public Communicator putExtra(String key, int value) {
        intent.putExtra(key, value);
        return instance;
    }

    public Communicator putExtra(String key, boolean value) {
        intent.putExtra(key, value);
        return instance;
    }

    public Communicator putExtra(String key, short value) {
        intent.putExtra(key, value);
        return instance;
    }

    public Communicator putExtra(String key, long value) {
        intent.putExtra(key, value);
        return instance;
    }

    public Communicator putExtra(String key, double value) {
        intent.putExtra(key, value);
        return instance;
    }

    public Communicator putExtras(String key, Bundle value) {
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

    public Finisher addTransition(Anim anim) {
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
        return Finisher.getInstance();
    }

    public void finish(Activity activity) {
        activity.finish();
    }
}

