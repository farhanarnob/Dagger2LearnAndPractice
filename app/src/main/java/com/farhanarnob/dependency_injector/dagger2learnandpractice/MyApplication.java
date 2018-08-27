package com.farhanarnob.dependency_injector.dagger2learnandpractice;

import android.app.Application;

/**
 * Created by Farhan Rahman Arnob on 8/27/2018.
 */
public class MyApplication extends Application {
    private MyComponent mMyComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mMyComponent = createMyComponent();
    }

    MyComponent getMyComponent() {
        return mMyComponent;
    }

    private MyComponent createMyComponent() {
        return DaggerMyComponent
                .builder()
                .build();
    }
}
