package com.farhanarnob.dependency_injector.dagger2learnandpractice;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Farhan Rahman Arnob on 8/27/2018.
 */
@Module
public class MyModule {
    @Provides
    @Singleton
    static IMyExample provideMyExample(){
        return new MyExampleImpl();
    }
}
