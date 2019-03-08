package bscs.com.earnmoney;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        new Handler().postDelayed(new Runnable(){

            @Override
            public void run(){
                startActivity(new Intent(HomeActivity.this,MainActivity.class));
            }
        },5000);
    }
}
