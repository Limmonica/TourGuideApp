package com.example.limmonica.tourguideapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ElementsPagerAdapter extends FragmentPagerAdapter {

    // Context of the app
    private Context mContext;

    /**
     * Create a new {@link ElementsPagerAdapter} object.
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    ElementsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int i) {
        if (i == 0) {
            return new RestaurantsFragment();
        } else if (i == 1) {
            return new PlacesFragment();
        } else if (i == 2) {
            return new EventsFragment();
        } else {
            return new ParksFragment();
        }
    }

    /**
     * Return the total number of pages
     */
    @Override
    public int getCount() {
        return 4;
    }

    /**
     * Return the proper element name per page
     *
     * @param position is the position of the element
     */
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.element_restaurants);
        } else if (position == 1) {
            return mContext.getString(R.string.element_places);
        } else if (position == 2) {
            return mContext.getString(R.string.element_events);
        } else {
            return mContext.getString(R.string.element_parks);
        }
    }
}
