package com.farhanarnob.dependency_injector.dagger2learnandpractice;

import java.util.Date;

/**
 * Created by Farhan Rahman Arnob on 8/27/2018.
 */
public class MyExampleImpl implements IMyExample {
    private static IMyExample myExample;
    private long mDate;
    private MyExampleImpl(){
        mDate = new Date().getTime();
    }

    public static IMyExample getInstance(){
        if (myExample == null){
            myExample = new MyExampleImpl();
        }
        return myExample;
    }
    @Override
    public long getDate() {
        return mDate;
    }
}
