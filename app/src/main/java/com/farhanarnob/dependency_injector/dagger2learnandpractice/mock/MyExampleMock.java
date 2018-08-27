package com.farhanarnob.dependency_injector.dagger2learnandpractice.mock;

import com.farhanarnob.dependency_injector.dagger2learnandpractice.IMyExample;

import dagger.Module;

/**
 * Created by Farhan Rahman Arnob on 8/27/2018.
 */
@Module
public class MyExampleMock implements IMyExample {
    @Override
    public long getDate() {
        return 0;
    }
}
