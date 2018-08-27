package com.farhanarnob.dependency_injector.dagger2learnandpractice;

import java.util.Date;

/**
 * Created by Farhan Rahman Arnob on 8/27/2018.
 */
public class MyExampleImpl implements IMyExample {

    private long mDate;
    public MyExampleImpl(){
        mDate = new Date().getTime();
    }
    @Override
    public long getDate() {
        return mDate;
    }
}
