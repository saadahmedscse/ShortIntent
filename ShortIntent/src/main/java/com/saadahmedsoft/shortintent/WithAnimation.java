package com.saadahmedsoft.shortintent;

import android.annotation.SuppressLint;
import android.view.View;

import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;

public class WithAnimation {

    @SuppressLint("StaticFieldLeak")
    volatile private static WithAnimation instance = null;
    private final FragAnim anim;
    volatile private static NavOptions.Builder navBuilder;

    private WithAnimation(FragAnim anim) {
        this.anim = anim;
    }

    public static WithAnimation getInstance(FragAnim anim) {
        if (instance == null) {
            instance = new WithAnimation(anim);
            navBuilder = new NavOptions.Builder();
        }
        return instance;
    }

    public void navigate(View v, int fragmentId) {
        Navigation.findNavController(v).navigate(fragmentId, null, getNavBuilder().build());
    }

    private NavOptions.Builder getNavBuilder() {
        switch (anim) {
            case CARD: {
                navBuilder.setEnterAnim(R.anim.animate_card_enter)
                        .setExitAnim(R.anim.animate_card_exit)
                        .setPopEnterAnim(R.anim.animate_card_enter)
                        .setPopExitAnim(R.anim.animate_card_exit);
                return navBuilder;
            }
            case DIAGONAL: {
                navBuilder.setEnterAnim(R.anim.animate_diagonal_right_enter)
                        .setExitAnim(R.anim.animate_diagonal_right_exit)
                        .setPopEnterAnim(R.anim.animate_diagonal_right_enter)
                        .setPopExitAnim(R.anim.animate_diagonal_right_exit);
                return navBuilder;
            }
            case FADE: {
                navBuilder.setEnterAnim(R.anim.animate_fade_enter)
                        .setExitAnim(R.anim.animate_fade_exit)
                        .setPopEnterAnim(R.anim.animate_fade_enter)
                        .setPopExitAnim(R.anim.animate_fade_exit);
                return navBuilder;
            }
            case INOUT: {
                navBuilder.setEnterAnim(R.anim.animate_in_out_enter)
                        .setExitAnim(R.anim.animate_in_out_exit)
                        .setPopEnterAnim(R.anim.animate_in_out_enter)
                        .setPopExitAnim(R.anim.animate_in_out_exit);
                return navBuilder;
            }
            case SHRINK: {
                navBuilder.setEnterAnim(R.anim.animate_shrink_enter)
                        .setExitAnim(R.anim.animate_shrink_exit)
                        .setPopEnterAnim(R.anim.animate_shrink_enter)
                        .setPopExitAnim(R.anim.animate_shrink_exit);
                return navBuilder;
            }
            case SPIN: {
                navBuilder.setEnterAnim(R.anim.animate_spin_enter)
                        .setExitAnim(R.anim.animate_spin_exit)
                        .setPopEnterAnim(R.anim.animate_spin_enter)
                        .setPopExitAnim(R.anim.animate_spin_exit);
                return navBuilder;
            }
            case SPLIT: {
                navBuilder.setEnterAnim(R.anim.animate_split_enter)
                        .setExitAnim(R.anim.animate_split_exit)
                        .setPopEnterAnim(R.anim.animate_split_enter)
                        .setPopExitAnim(R.anim.animate_split_exit);
                return navBuilder;
            }
            case SLIDE_VERTICAL: {
                navBuilder.setEnterAnim(R.anim.animate_slide_up_enter)
                        .setExitAnim(R.anim.animate_slide_up_exit)
                        .setPopEnterAnim(R.anim.animate_slide_down_enter)
                        .setPopExitAnim(R.anim.animate_slide_down_exit);
                return navBuilder;
            }
            case SWIPE: {
                navBuilder.setEnterAnim(R.anim.animate_swipe_right_enter)
                        .setExitAnim(R.anim.animate_swipe_right_exit)
                        .setPopEnterAnim(R.anim.animate_swipe_left_enter)
                        .setPopExitAnim(R.anim.animate_swipe_left_exit);
                return navBuilder;
            }
            case WINDMILL: {
                navBuilder.setEnterAnim(R.anim.animate_windmill_enter)
                        .setExitAnim(R.anim.animate_windmill_exit)
                        .setPopEnterAnim(R.anim.animate_windmill_enter)
                        .setPopExitAnim(R.anim.animate_windmill_exit);
                return navBuilder;
            }
            case ZOOM: {
                navBuilder.setEnterAnim(R.anim.animate_zoom_enter)
                        .setExitAnim(R.anim.animate_zoom_exit)
                        .setPopEnterAnim(R.anim.animate_zoom_enter)
                        .setPopExitAnim(R.anim.animate_zoom_exit);
                return navBuilder;
            }
        }
        return navBuilder;
    }
}
