/*
 * Copyright 2022 Saad Ahmed
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
