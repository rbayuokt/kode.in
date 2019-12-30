package com.whoami.kodein;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        CardView menu1 = (CardView) findViewById(R.id.menu1);
        CardView menu2 = (CardView) findViewById(R.id.menu2);
        CardView menu3 = (CardView) findViewById(R.id.menu3);
        CardView menu4 = (CardView) findViewById(R.id.menu4);
        CardView menu5 = (CardView) findViewById(R.id.menu5);
        menu1.setOnClickListener(this);
        menu2.setOnClickListener(this);
        menu3.setOnClickListener(this);
        menu4.setOnClickListener(this);
        menu5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.menu1:
                Intent menu1 = new Intent(MainActivity.this, SandiMorseActivity.class);
                startActivity(menu1);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                break;

            case R.id.menu2:
                Intent menu2 = new Intent(MainActivity.this, SandiRumputActivity.class);
                startActivity(menu2);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                break;

            case R.id.menu3:
                Intent menu3 = new Intent(MainActivity.this, SandiKotakActivity.class);
                startActivity(menu3);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                break;

            case R.id.menu4:
                Intent menu4 = new Intent(MainActivity.this, SandiSemaforActivity.class);
                startActivity(menu4);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                break;

            case R.id.menu5:
                Intent about = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(about);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                break;
        }
    }
}
