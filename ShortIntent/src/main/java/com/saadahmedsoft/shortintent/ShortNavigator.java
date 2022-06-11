package com.saadahmedsoft.shortintent;

import android.view.View;
import androidx.navigation.Navigation;

public class ShortNavigator {

    /**
     * Custom Navigator class.
     * Made by Saad Ahmed on 11-June-2022.
     * This class has been made to simplify the built-in Navigation class.
     * Animate between two fragments.
     */

    volatile private static ShortNavigator instance = null;

    public static ShortNavigator getInstance() {
        if (instance == null) {
            instance = new ShortNavigator();
        }
        return instance;
    }

    public WithAnimation addAnimation(FragAnim anim) {
        return WithAnimation.getInstance(anim);
    }

    public void navigate(View v, int fragmentId) {
        Navigation.findNavController(v).navigate(fragmentId);
    }
}
