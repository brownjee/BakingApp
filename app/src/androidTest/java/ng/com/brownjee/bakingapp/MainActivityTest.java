package ng.com.brownjee.bakingapp;

import android.support.test.espresso.ViewInteraction;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import ng.com.brownjee.bakingapp.activities.MainActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;



@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);


    @Test
    public void mainActivityTest() {
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recipie_list)
                               ,
                        isDisplayed()));
        recyclerView.perform(actionOnItemAtPosition(1, click()));

       ViewInteraction recyclerView2 = onView(allOf(withId(R.id.ingredientslist), isDisplayed()));

        ViewInteraction recyclerView3 = onView(allOf(withId(R.id.stepslist), isDisplayed()));

        recyclerView3.perform(actionOnItemAtPosition(1,click()));



    }
}
