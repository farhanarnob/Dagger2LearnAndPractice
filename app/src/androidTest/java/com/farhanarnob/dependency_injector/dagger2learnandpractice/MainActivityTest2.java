package com.farhanarnob.dependency_injector.dagger2learnandpractice;


import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.ViewInteraction;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.farhanarnob.dependency_injector.dagger2learnandpractice.mock.DaggerMyComponentMock;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest2 {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class){
        @Override
        protected void beforeActivityLaunched() {
            super.beforeActivityLaunched();
            MyApplication application = (MyApplication) InstrumentationRegistry
                    .getInstrumentation()
                    .getTargetContext()
                    .getApplicationContext();
            MyComponent myComponent = DaggerMyComponentMock.builder().build();
            application.setMyComponent(myComponent);

        }
    };

    @Test
    public void mainActivityTest2() {
        ViewInteraction textView = onView(
                allOf(withId(R.id.tvDate),
                        isDisplayed()));
        textView.check(matches(withText("Thu Jan 01 06:00:00 GMT+06:00 1970")));

    }
}
