package com.farhanarnob.dependency_injector.dagger2learnandpractice.mock;

import com.farhanarnob.dependency_injector.dagger2learnandpractice.MainActivity;
import com.farhanarnob.dependency_injector.dagger2learnandpractice.MyComponent;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Farhan Rahman Arnob on 8/27/2018.
 */
@Singleton
@Component(modules = MyModuleMock.class)
public interface MyComponentMock extends MyComponent {
}