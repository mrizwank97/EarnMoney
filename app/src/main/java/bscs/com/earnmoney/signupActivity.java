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

public class signupActivity extends AppCompatActivity {
    private AdView task1adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        initialize();

        MobileAds.initialize(this,String.valueOf(R.string.app_id));
        AdRequest adRequest = new AdRequest.Builder().build();
        task1adView.loadAd(adRequest);
        Button button4= (Button)findViewById(R.id.button4);
        final EditText editText=(EditText)findViewById(R.id.editText);
        final EditText editText2=(EditText)findViewById(R.id.editText2);
        final EditText editText3=(EditText)findViewById(R.id.editText3);
        final EditText editText6=(EditText)findViewById(R.id.editText6);
        final EditText editText7=(EditText)findViewById(R.id.editText7);


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((editText!=null && editText.length()>0) && (editText2!=null && editText2.length()>0) && (editText3!=null && editText3.length()>0)&&(editText6!=null && editText6.length()>0)&&(editText7!=null && editText7.length()>0)){
                    startActivity(new Intent(signupActivity.this,loginActivity.class));
                }
            }
        });
    }
    private void initialize() {
        task1adView = findViewById(R.id.signupadView);
    }
}
