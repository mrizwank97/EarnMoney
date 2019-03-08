package bscs.com.earnmoney;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

public class Main4Activity extends AppCompatActivity implements RewardedVideoAdListener, View.OnClickListener {
    private RewardedVideoAd rewardedVideoAd;
    private AdView task1adView;
    private Button button14;

    //private static final String AD_UNIT_ID = "ca-app-pub-3940256099942544/5224354917";
    //private static final String APP_ID = "ca-app-pub-3940256099942544~3347511713";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        initialize();
        MobileAds.initialize(this, String.valueOf(R.string.app_id));
        AdRequest adRequest = new AdRequest.Builder().build();
        task1adView.loadAd(adRequest);


        //MobileAds.initialize(this,APP_ID);
        MobileAds.initialize(this, String.valueOf(R.string.app_id));

        rewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this);
        rewardedVideoAd.setRewardedVideoAdListener(this);
        loadRewardedVideoAd();
        button14.setOnClickListener(this);
    }
    private void loadRewardedVideoAd(){
        AdRequest request = new AdRequest.Builder().build();
         rewardedVideoAd.loadAd(String.valueOf(R.string.reward_video_id3),request);
        //rewardedVideoAd.loadAd(AD_UNIT_ID,request);

    }

    @Override
    public void onRewardedVideoAdLoaded() {
        Toast.makeText(this, "onRewardedVideoAdLoaded", Toast.LENGTH_SHORT).show();
        if (rewardedVideoAd.isLoaded()) {
            rewardedVideoAd.show();
        }

    }

    @Override
    public void onRewardedVideoAdOpened() {

    }

    @Override
    public void onRewardedVideoStarted() {

    }

    @Override
    public void onRewardedVideoAdClosed() {
        button14.setEnabled(true);
    }

    @Override
    public void onRewarded(RewardItem rewardItem) {

    }

    @Override
    public void onRewardedVideoAdLeftApplication() {

    }

    @Override
    public void onRewardedVideoAdFailedToLoad(int i) {
        Toast.makeText(this, "onRewardedVideoAdFailedToLoad: " + i, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onRewardedVideoCompleted() {

    }
    private void initialize() {
        task1adView = findViewById(R.id.task4adView);
        button14= findViewById(R.id.button14);
    }

    @Override
    public void onClick(View view) {
        //Intent intent = new Intent(this,Main4Activity.class);
        //startActivity(intent);
    }
}