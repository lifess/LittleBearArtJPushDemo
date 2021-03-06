package com.ss.example.littlebearartjp;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;
import cn.jpush.android.helper.Logger;

public class App extends Application {
    private static final String TAG = "JIGUANG-Example";

    @Override
    public void onCreate() {
        Logger.d(TAG, "[ExampleApplication] onCreate");
        super.onCreate();

        JPushInterface.setDebugMode(true); 	// 设置开启日志,发布时请关闭日志
        JPushInterface.init(this);     		// 初始化 JPush
    }
}
