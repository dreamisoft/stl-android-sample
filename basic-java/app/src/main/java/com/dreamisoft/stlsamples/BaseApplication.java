package com.dreamisoft.stlsamples;


import android.app.Application;

import com.dreamisoft.stl.core.tizzer;


public class BaseApplication extends Application {

    //private static final String APP_ID = "9DA1B1F4-0BE6-4DA8-82C5-2E81DAB56F23"; // US-1 Demo
    private static final String APP_ID = "4C8F5AEA-3846-441A-A034-A3E531FC9BC8"; // tizzer STL
    public static final String VERSION = "0.0.1";

    @Override
    public void onCreate() {
        super.onCreate();
        tizzer.init(APP_ID,this);
    }
}
