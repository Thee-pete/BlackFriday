package com.zuture.apps.blackfridaynew.popUpAds;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

import com.facebook.ads.*;

public class PopUpAdsApps {
    public static int AD_COUNT;
    public static final int AD_SHOW_COUNT=1;

    public static void ShowInterstitialAds(final Context mContext, final String link){
        AD_COUNT++;
        if (AD_COUNT==AD_SHOW_COUNT){
            AD_COUNT=0;

            final InterstitialAd interstitialAd = new InterstitialAd(mContext,"319709779633368_319709972966682");

            final String TAG = PopUpAds.class.getSimpleName();
            InterstitialAdListener interstitialAdListener = new InterstitialAdListener() {
                @Override
                public void onInterstitialDisplayed(Ad ad) {
                    // Interstitial ad displayed callback
                    Log.e(TAG, "Interstitial ad displayed.");
                }

                @Override
                public void onInterstitialDismissed(Ad ad) {
                    Log.d(TAG, "Interstitial ad clicked!");
                }

                @Override
                public void onError(Ad ad, AdError adError) {
                    Intent intent1 = new Intent(Intent.ACTION_VIEW);
                    intent1.setData(Uri.parse(link));
                    intent1.setPackage("com.android.vending");
                    mContext.startActivity(intent1);
                }

                @Override
                public void onAdLoaded(Ad ad) {

                    interstitialAd.show();
                }

                @Override
                public void onAdClicked(Ad ad) {
                    // Ad clicked callback
                    Log.d(TAG, "Interstitial ad clicked!");
                }

                @Override
                public void onLoggingImpression(Ad ad) {
                    // Ad impression logged callback
                    Log.d(TAG, "Interstitial ad impression logged!");
                }
            };
            interstitialAd.loadAd(
                    interstitialAd.buildLoadAdConfig()
                            .withAdListener(interstitialAdListener)
                            .build());



        }
        else {
            Intent intent1 = new Intent(Intent.ACTION_VIEW);
            intent1.setData(Uri.parse(link));
            intent1.setPackage("com.android.vending");
            mContext.startActivity(intent1);

        }

    }
}
