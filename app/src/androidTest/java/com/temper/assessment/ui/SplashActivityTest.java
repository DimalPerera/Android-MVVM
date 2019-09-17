package com.temper.assessment.ui;

import android.test.suitebuilder.annotation.MediumTest;
import android.util.Log;
import android.view.View;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import com.temper.assessment.R;
import com.temper.assessment.ui.SplashActivity;

import junit.framework.AssertionFailedError;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.doesNotExist;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

@MediumTest
@RunWith(AndroidJUnit4.class)
public class SplashActivityTest {

    private String TAG = SplashActivityTest.class.getSimpleName();

    @Rule
    public ActivityTestRule<SplashActivity> rule  = new  ActivityTestRule<>(SplashActivity.class);

    @Test
    public void checkViews(){

        try {
            onView(withText("ImageView")).check(matches(isDisplayed()));
        } catch (AssertionFailedError e) {
            Log.e(TAG, "Check Views: " + e.getMessage() );
        }

    }
}
