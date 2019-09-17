package com.temper.assessment.ui;


import android.util.Log;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;
import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.DataInteraction;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.NoMatchingViewException;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.ViewAssertion;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.espresso.matcher.RootMatchers;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import com.temper.assessment.R;

import junit.framework.AssertionFailedError;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.core.app.ApplicationProvider.getApplicationContext;
import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest  {

    private String TAG = MainActivityTest.class.getSimpleName();

    @Rule
    public ActivityTestRule<MainActivity> mainActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void checkViews(){

        try {
            onView(withText("RecyclerView")).check(matches(isDisplayed()));
        } catch (AssertionFailedError e) {
            Log.e(TAG, "Check Views: " + e.getMessage() );
        }

    }

    /*@Test
    public void setupTest() {
        //this.rvJobList = this.rvJobList.findViewById(resId_RecyclerView);
        //this.itemCount = this.rvJobList.getAdapter().getItemCount();

        RecyclerView recyclerView = mainActivityTestRule.getActivity().findViewById(R.id.rvJobList);
        int itemCount = recyclerView.getAdapter().getItemCount();

        Log.e(TAG, "setupTest: " + itemCount );

        for(int i = 0 ; i < itemCount ; i++) {
            onView(withId(R.id.rvJobList)).perform(RecyclerViewActions.scrollToPosition(i));
        }

    }*/


    /*Check recyclerview visibility*/
    @Test
    public void checkRecyclerVisible() {
        Espresso.onView(ViewMatchers.withId(R.id.rvJobList))
                .inRoot(RootMatchers.withDecorView(
                        Matchers.is(mainActivityTestRule.getActivity().getWindow().getDecorView())))
                .check(matches(isDisplayed()));
    }

    @Test
    public void scrollToItem() {

        // Get total item of RecyclerView
        RecyclerView recyclerView = mainActivityTestRule.getActivity().findViewById(R.id.rvJobList);
        int itemCount = recyclerView.getAdapter().getItemCount();

        // Scroll to end of page with position
        Espresso.onView(ViewMatchers.withId(R.id.rvJobList))
                .inRoot(RootMatchers.withDecorView(
                        Matchers.is(mainActivityTestRule.getActivity().getWindow().getDecorView())))
                .perform(RecyclerViewActions.scrollToPosition(itemCount - 1));


    }

    @Test
    public void testCaseForRecyclerClick() {
        Espresso.onView(ViewMatchers.withId(R.id.rvJobList))
                .inRoot(RootMatchers.withDecorView(
                        Matchers.is(mainActivityTestRule.getActivity().getWindow().getDecorView())))
                .perform(RecyclerViewActions.actionOnItemAtPosition(0, click()));
    }


}
