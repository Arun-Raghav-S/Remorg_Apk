
package com.example.remorgnew;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class studymaterial1 extends AppCompatActivity {
    Button button34;
    Button button35;
    Button button36;
    Button button37;
    Button button38;
    Button button39;
    Button button40;
    Button button41;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studymaterial1);

        button34 = findViewById(R.id.button34);

        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/drive/folders/1xijFleBbOnKVEAvQrPOENPoxPLbYwVRQ?usp=sharing");
            }
        });

        button35 = findViewById(R.id.button35);

        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/drive/folders/1_xRRY9n2-mp6XdKu3029cKZYSMPld9LF?usp=sharing");
            }
        });

        button36 = findViewById(R.id.button36);

        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/drive/folders/1sE1ifpWbFoheapA6e1F1U_Rp4oA1cFMh?usp=sharing");
            }
        });

        button37 = findViewById(R.id.button37);

        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/drive/folders/1H1cWc-YG4lT2-c9SuneqkDiufgauX_zE?usp=sharing");
            }
        });

        button38 = findViewById(R.id.button38);

        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/drive/folders/10Ko9UiBt8bOB875OxsLpjdCy0PXo0a8C?usp=sharing");
            }
        });

        button39 = findViewById(R.id.button39);

        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/drive/folders/1KJJw8Byya6BCVbILn3PtMDhNhAfo2wll?usp=sharing");
            }
        });

        button40 = findViewById(R.id.button40);

        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/drive/folders/1qBDztY4nKnN9UyJ8FLkyFdKWQ4x0FMIl?usp=sharing");
            }
        });

        button41 = findViewById(R.id.button41);

        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/drive/folders/1wfiskvefOUYDUuhrTBGX6iLLlxA4UeWv?usp=sharinghttps://drive.google.com/drive/folders/1wfiskvefOUYDUuhrTBGX6iLLlxA4UeWv?usp=sharing");
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }


}