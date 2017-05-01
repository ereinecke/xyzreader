package com.ereinecke.xyzreader.remote;

import android.util.Log;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;
    private static final String LOG_TAG = Config.class.getSimpleName();
    private static final String dummyJSON = "http://ereinecke.com/json/xyzreader_data_1.json";

    static {
        URL url = null;
        try {
            url = new URL(dummyJSON);
        } catch (MalformedURLException e) {
            Log.d(LOG_TAG, e.getMessage());
        }

        BASE_URL = url;
    }
}
