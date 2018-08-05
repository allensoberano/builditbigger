package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.IsNot.not;


//Manually Created Test
//Also created the same test but with the Espresso Recorder: See TellJokeTest.java
@RunWith(AndroidJUnit4.class)
public class JokeBasicTest {

    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void openNewJoke(){

        //Clicks Tell Joke Button
        onView(withId(R.id.button_joke)).perform(click());

        onView(withId(R.id.tv_joke)).check(matches(not(withText(""))));

    }
}
