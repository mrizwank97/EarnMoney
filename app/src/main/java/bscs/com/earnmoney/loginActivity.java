package bscs.com.earnmoney;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class loginActivity extends AppCompatActivity {
    private AdView task1adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initialize();

        MobileAds.initialize(this,String.valueOf(R.string.app_id));
        AdRequest adRequest = new AdRequest.Builder().build();
        task1adView.loadAd(adRequest);

        Button button3=(Button)findViewById(R.id.button3);
        final EditText editText5=(EditText)findViewById(R.id.editText5);
        final EditText editText4=(EditText)findViewById(R.id.editText4);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((editText4!=null &&  editText4.length()>0) && (editText5!=null && editText5.length()>0)){
                    startActivity(new Intent(loginActivity.this,menuActivity.class));
                }
            }
        });
    }
    private void initialize() {
        task1adView = findViewById(R.id.loginadView);
    }
}
