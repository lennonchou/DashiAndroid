package com.laioffer.laiofferproject;

import android.support.test.InstrumentationRegistry;
import android.test.ActivityInstrumentationTestCase2;

import org.junit.After;
import org.junit.Before;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.anything;

/**
 * Created by zhou on 6/21/2016.
 */
public class RestaurantListActivityTest
        extends ActivityInstrumentationTestCase2<RestaurantListActivity> {

    private RestaurantListActivity restaurantListActivity;

    public RestaurantListActivityTest() {
        super(RestaurantListActivity.class);
    }

    public void testListEntryCount() {
        onData(anything())
                .inAdapterView(withId(R.id.restaurant_list))
                .atPosition(19)
                .check(matches(isDisplayed()));
    }

    @Before
    public void setUp() throws Exception {
        super.setUp();
        injectInstrumentation(InstrumentationRegistry.getInstrumentation());
        restaurantListActivity = getActivity();
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }
}
