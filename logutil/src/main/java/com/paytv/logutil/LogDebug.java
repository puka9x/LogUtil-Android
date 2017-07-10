package com.paytv.logutil;

import android.util.Log;

/**
 * Created by trivm on 7/10/17.
 */

public class LogDebug {

    private static final String TAG = "UTIL_DEBUG";

    public static void d(String message) {
        Log.d(TAG, message);
    }
}
