package com.farhanarnob.dependency_injector.dagger2learnandpractice;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Provides;

/**
 * Created by Farhan Rahman Arnob on 8/27/2018.
 */
@Singleton
@Component(modules = MyModule.class)
public interface MyComponent {

    void inject(MainActivity mainActivity);
}
