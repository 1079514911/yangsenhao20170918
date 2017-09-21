package com.example.administrator.yangsenhao20170918;

import android.app.Application;

/**
 * Created by Administrator on 2017-9-18.
 */

public class APP extends Application {
    @Override
    public void onCreate() {

        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(getApplicationContext());
    }
}
