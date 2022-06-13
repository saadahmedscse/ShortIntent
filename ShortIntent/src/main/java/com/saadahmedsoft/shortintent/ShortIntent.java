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

import com.google.gson.Gson;

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
    volatile private static ShortIntent instance = null;

    /**
     * Activity is required to get the instance of ShortIntent class
     *
     * @param activity Intent from the activity
     * @return Returns instance of ShortIntent class
     */

    public static ShortIntent getInstance(Activity activity) {
        if (instance == null) {
            instance = new ShortIntent(activity);
        }
        return instance;
    }

    /**
     * Destination is required to get the instance of Communicator class
     *
     * @param destination Intent to the activity
     * @return Returns instance of Communicator class
     */

    public Communicator addDestination(Class<?> destination) {
        intent = new Intent(activity, destination);
        activity.startActivity(intent);
        return Communicator.getInstance(intent, activity);
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
}
