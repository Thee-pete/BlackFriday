package com.zuture.apps.blackfridaynew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.codemybrainsout.ratingdialog.RatingDialog;
import com.facebook.ads.*;
import com.facebook.ads.AudienceNetworkAds;
import com.google.android.material.tabs.TabLayout;
import com.zuture.apps.blackfridaynew.adapters.TabAdapter;
import com.zuture.apps.blackfridaynew.fragments.AppsFragment;
import com.zuture.apps.blackfridaynew.fragments.StoresFragment;
import com.zuture.apps.blackfridaynew.fragments.TipsFragment;

public class MainActivity extends AppCompatActivity {

    private TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.NoActionBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);


        adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(new TipsFragment(), "Tips");
        adapter.addFragment(new StoresFragment(), "Stores");
        adapter.addFragment(new AppsFragment(), "Apps");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


        AudienceNetworkAds.initialize(this);

        adView = new AdView(this, "319709779633368_319710462966633", AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.ad_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();



        final RatingDialog ratingDialog = new RatingDialog.Builder(this)
                .threshold(0)
                .session(2)
                .onRatingBarFormSumbit(new RatingDialog.Builder.RatingDialogFormListener() {
                    @Override
                    public void onFormSubmitted(String feedback) {

                    }
                }).build();

        ratingDialog.show();
    }
}