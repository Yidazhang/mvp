package com.example.tony.mvp;

import android.app.Application;

import com.example.tony.mvp.base.dagger.ApplicationComponent;
import com.example.tony.mvp.base.dagger.DaggerApplicationComponent;

/**
 * Created by Tony on 7/7/16.
 */
public class ZYApplication extends Application {
    private static ApplicationComponent zyComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        zyComponent = DaggerApplicationComponent.create();
    }

    public static ApplicationComponent getComponent() {
        return zyComponent;
    }
}
