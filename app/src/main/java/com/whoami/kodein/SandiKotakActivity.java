package com.whoami.kodein;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SandiKotakActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sandi_kotak);

        //btn konversi
        Button konversi_kotak = (Button) findViewById(R.id.btn_converKotak);
        konversi_kotak.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_converKotak:
                EditText kotakna = (EditText) findViewById(R.id.edt_kotak);
                TextView lblhsl = (TextView) findViewById(R.id.lbl_hsl);
                TextView hsl = (TextView) findViewById(R.id.hsl_konversi_kotak);

                lblhsl.setVisibility(View.VISIBLE);
                hsl.setVisibility(View.VISIBLE);

                hsl.setText(kotakna.getText().toString().toLowerCase());
                break;
        }
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }

}
