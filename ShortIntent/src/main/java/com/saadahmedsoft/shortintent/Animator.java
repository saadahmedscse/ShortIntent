package com.saadahmedsoft.shortintent;

import android.app.Activity;

public class Animator {
    public static void animateCard(Activity activity) {
        activity.overridePendingTransition(
                R.anim.animate_card_enter,
                R.anim.animate_card_exit
        );
    }

    public static void animateDiagonal(Activity activity) {
        activity.overridePendingTransition(
                R.anim.animate_diagonal_right_enter,
                R.anim.animate_diagonal_right_exit
        );
    }

    public static void animateFade(Activity activity) {
        activity.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
        );
    }

    public static void animateInAndOut(Activity activity) {
        activity.overridePendingTransition(
                R.anim.animate_in_out_enter,
                R.anim.animate_in_out_exit
        );
    }

    public static void animateShrink(Activity activity) {
        activity.overridePendingTransition(
                R.anim.animate_shrink_enter,
                R.anim.animate_shrink_exit
        );
    }

    public static void animateSlideDown(Activity activity) {
        activity.overridePendingTransition(
                R.anim.animate_slide_down_enter,
                R.anim.animate_slide_down_exit
        );
    }

    public static void animateSlideLeft(Activity activity) {
        activity.overridePendingTransition(
                R.anim.animate_slide_left_enter,
                R.anim.animate_slide_left_exit
        );
    }

    public static void animateSwipeRight(Activity activity) {
        activity.overridePendingTransition(
                R.anim.animate_swipe_right_enter,
                R.anim.animate_swipe_right_exit
        );
    }

    public static void animateSlideUp(Activity activity) {
        activity.overridePendingTransition(
                R.anim.animate_slide_up_enter,
                R.anim.animate_slide_up_exit
        );
    }

    public static void animateSpin(Activity activity) {
        activity.overridePendingTransition(
                R.anim.animate_spin_enter,
                R.anim.animate_spin_exit
        );
    }

    public static void animateSplit(Activity activity) {
        activity.overridePendingTransition(
                R.anim.animate_split_enter,
                R.anim.animate_split_exit
        );
    }

    public static void animateSwipeLeft(Activity activity) {
        activity.overridePendingTransition(
                R.anim.animate_swipe_left_enter,
                R.anim.animate_swipe_left_exit
        );
    }

    public static void animateSlideRight(Activity activity) {
        activity.overridePendingTransition(
                R.anim.animate_slide_in_left,
                R.anim.animate_slide_out_right
        );
    }

    public static void animateWindmill(Activity activity) {
        activity.overridePendingTransition(
                R.anim.animate_windmill_enter,
                R.anim.animate_windmill_exit
        );
    }

    public static void animateZoom(Activity activity) {
        activity.overridePendingTransition(
                R.anim.animate_zoom_enter,
                R.anim.animate_zoom_exit
        );
    }
}
