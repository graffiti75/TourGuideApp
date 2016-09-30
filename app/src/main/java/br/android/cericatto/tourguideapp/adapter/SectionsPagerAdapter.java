package br.android.cericatto.tourguideapp.adapter;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import br.android.cericatto.tourguideapp.R;
import br.android.cericatto.tourguideapp.data.Globals;
import br.android.cericatto.tourguideapp.fragment.EstablishmentFragment;

/**
 * SectionsPagerAdapter.java.
 *
 * @author Rodrigo Cericatto
 * @since Sep 30, 2016
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    //--------------------------------------------------
    // Attributes
    //--------------------------------------------------

    private Activity mActivity;

    //--------------------------------------------------
    // Constructor
    //--------------------------------------------------

    public SectionsPagerAdapter(Activity activity, FragmentManager fragmentManager) {
        super(fragmentManager);
        mActivity = activity;
    }

    //--------------------------------------------------
    // Fragment Pager Adapter
    //--------------------------------------------------

    @Override
    public Fragment getItem(int position) {
        return EstablishmentFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        return Globals.LIMIT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mActivity.getString(R.string.activity_main__squares_tab);
            case 1:
                return mActivity.getString(R.string.activity_main__parks_tab);
            case 2:
                return mActivity.getString(R.string.activity_main__monuments_tab);
            case 3:
                return mActivity.getString(R.string.activity_main__food_tab);
        }
        return null;
    }
}