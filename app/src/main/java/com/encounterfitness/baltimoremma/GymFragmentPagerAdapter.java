package com.encounterfitness.baltimoremma;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class GymFragmentPagerAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link GymFragmentPagerAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public GymFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new GymSelectionFragment();
        } else if (position == 1) {
            return new BoxingFragment();
        } else if (position == 2) {
            return new BrazilianJiuJitsuFragment();
        } else if (position == 3) {
            return new KidFriendlyFragment();
        }else {
            return new MuayThaiFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.selectionscreen);
        } else if (position == 1) {
            return mContext.getString(R.string.boxing);
        } else if (position == 2) {
            return mContext.getString(R.string.bjj);
        } else if (position == 2) {
            return mContext.getString(R.string.kidfriendly);
        }   else {
            return mContext.getString(R.string.muaythia);
        }
    }
}
