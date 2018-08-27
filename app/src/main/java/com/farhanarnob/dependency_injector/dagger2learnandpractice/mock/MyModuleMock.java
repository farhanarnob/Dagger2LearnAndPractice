package com.farhanarnob.dependency_injector.dagger2learnandpractice.mock;

import com.farhanarnob.dependency_injector.dagger2learnandpractice.IMyExample;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Farhan Rahman Arnob on 8/27/2018.
 */
@Module
public class MyModuleMock {
    @Singleton
    @Provides
    public IMyExample provideMyExampleMock(){
        return new MyExampleMock();
    }
}
