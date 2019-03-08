package bscs.com.earnmoney;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class menuActivity extends AppCompatActivity {
    private AdView task1adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        initialize();

        MobileAds.initialize(this,String.valueOf(R.string.app_id));
        AdRequest adRequest = new AdRequest.Builder().build();
        task1adView.loadAd(adRequest);
        Button button8= (Button)findViewById(R.id.button8);
        Button button9= (Button)findViewById(R.id.button9);
        Button button10= (Button)findViewById(R.id.button10);
        Button button7= (Button)findViewById(R.id.button7);
        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(menuActivity.this,Notification.class));

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View view) {
                startActivity(new Intent(menuActivity.this,taskActivity.class));
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(menuActivity.this,InviteActivity.class));
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(menuActivity.this,ContactActivity.class));
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(menuActivity.this,walletActivity.class));
            }
        });
    }
    private void initialize() {
        task1adView = findViewById(R.id.menuadView);
    }
}
