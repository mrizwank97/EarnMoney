package bscs.com.earnmoney;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class walletActivity extends AppCompatActivity {
    private AdView task1adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallet);
        initialize();

        MobileAds.initialize(this,String.valueOf(R.string.app_id));
        AdRequest adRequest = new AdRequest.Builder().build();
        task1adView.loadAd(adRequest);
    }
    private void initialize() {
        task1adView = findViewById(R.id.walletadView);
    }
}
