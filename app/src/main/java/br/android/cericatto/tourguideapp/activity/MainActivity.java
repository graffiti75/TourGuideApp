package br.android.cericatto.tourguideapp.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import br.android.cericatto.tourguideapp.R;
import br.android.cericatto.tourguideapp.adapter.SectionsPagerAdapter;

/**
 * MainActivity.java.
 *
 * @author Rodrigo Cericatto
 * @since Sep 29, 2016
 */
public class MainActivity extends AppCompatActivity {

    //--------------------------------------------------
    // Attributes
    //--------------------------------------------------

    private Activity mActivity = MainActivity.this;
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    //--------------------------------------------------
    // Activity Life Cycle
    //--------------------------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setToolbar();
        setViewPager();
        setTabLayout();
    }

    //--------------------------------------------------
    // Other Methods
    //--------------------------------------------------

    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private void setViewPager() {
        // Create the adapter that will return a fragment for each of the three primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(mActivity, getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
    }

    private void setTabLayout() {
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }
}