package com.whoami.kodein;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SandiMorseActivity extends AppCompatActivity implements View.OnClickListener{

    private static String[] morseCodeChar = {
            ".- ",
            "-... ",
            "-.-. ",
            "-.. ",
            ". ",
            "..-. ",
            "--. ",
            ".... ",
            ".. ",
            ".--- ",
            "-.- ",
            ".-.. ",
            "-- ",
            "-. ",
            "--- ",
            ".--. ",
            "--.- ",
            ".-. ",
            "... ",
            "- ",
            "..- ",
            "...- ",
            ".-- ",
            "-..- ",
            "-.-- ",
            "--.. ",
            " ",
    };

    private static String[] morseCodeNumber = {
            ".---- ",
            "..--- ",
            "...-- ",
            "....- ",
            "..... ",
            "-.... ",
            "--... ",
            "---.. ",
            "----. ",
            "---- ",
            " ",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sandi_morse);

        //button
        Button btn_convert_morse = (Button) findViewById(R.id.btn_convertMorse);
        btn_convert_morse.setOnClickListener(this);

    }


    public String konversiMorse(char ch){
        String kode = "";

        if( ch == 'a' ){
            kode = morseCodeChar[0];
        }

        if(ch == 'b'){
            kode = morseCodeChar[1];
        }

        if(ch == 'c'){
            kode = morseCodeChar[2];
        }

        if(ch == 'd'){
            kode = morseCodeChar[3];
        }

        if(ch == 'e'){
            kode = morseCodeChar[4];
        }

        if(ch == 'f'){
            kode = morseCodeChar[5];
        }

        if(ch == 'g'){
            kode = morseCodeChar[6];
        }

        if(ch == 'h'){
            kode = morseCodeChar[7];
        }

        if(ch == 'i'){
            kode = morseCodeChar[8];
        }

        if(ch == 'j'){
            kode = morseCodeChar[9];
        }

        if(ch == 'k'){
            kode = morseCodeChar[10];
        }

        if(ch == 'l'){
            kode = morseCodeChar[11];
        }

        if(ch == 'm'){
            kode = morseCodeChar[12];
        }

        if(ch == 'n'){
            kode = morseCodeChar[13];
        }

        if(ch == 'o'){
            kode = morseCodeChar[14];
        }

        if(ch == 'p'){
            kode = morseCodeChar[15];
        }

        if(ch == 'q'){
            kode = morseCodeChar[16];
        }

        if(ch == 'r'){
            kode = morseCodeChar[17];
        }

        if(ch == 's'){
            kode = morseCodeChar[18];
        }

        if(ch == 't'){
            kode = morseCodeChar[19];
        }

        if(ch == 'u'){
            kode = morseCodeChar[20];
        }

        if(ch == 'v'){
            kode = morseCodeChar[21];
        }

        if(ch == 'w'){
            kode = morseCodeChar[22];
        }

        if(ch == 'x'){
            kode = morseCodeChar[23];
        }

        if(ch == 'y'){
            kode = morseCodeChar[24];
        }

        if(ch == 'z'){
            kode = morseCodeChar[25];
        }

        if(ch == '1'){
            kode = morseCodeNumber[0];
        }

        if(ch == '2'){
            kode = morseCodeNumber[1];
        }

        if(ch == '3'){
            kode = morseCodeNumber[2];
        }

        if(ch == '4'){
            kode = morseCodeNumber[3];
        }

        if(ch == '5'){
            kode = morseCodeNumber[4];
        }

        if(ch == '6'){
            kode = morseCodeNumber[5];
        }

        if(ch == '7'){
            kode = morseCodeNumber[6];
        }

        if(ch == '8'){
            kode = morseCodeNumber[7];
        }

        if(ch == '9'){
            kode = morseCodeNumber[8];
        }

        if(ch == '0'){
            kode = morseCodeNumber[9];
        }

        if(ch == ' '){
            kode = "  ";
        }

        return kode;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_convertMorse:
                EditText morsena = (EditText) findViewById(R.id.edt_morse);
                TextView lblhsl = (TextView) findViewById(R.id.lbl_hsl);
                TextView hsl = (TextView) findViewById(R.id.hsl_konversi_morse);

                lblhsl.setVisibility(View.VISIBLE);
                hsl.setVisibility(View.VISIBLE);

                //get string dari textfield
                String morse = morsena.getText().toString().toLowerCase();

                //konversi ke char
                char[] morseChar = morse.toCharArray();

                String hslnya = "";
                for (int i = 0 ; i < morseChar.length ; i++){
//                    hslnya += String.valueOf(morseChar[i]);
                    hslnya += konversiMorse(morseChar[i]);
                }

                hsl.setText(hslnya);
                break;
        }
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }
}
