package com.example.remorgnew;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class organiserforcs_ai_ee extends AppCompatActivity {

     Button chemistry ;
     Button maths;
     Button engineering_mechanics;
     Button computer_science;
     Button engineering_design;
    Button socialconnect;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organiserforcs_ai_ee);
        chemistry=findViewById(R.id.button15);
        maths=findViewById(R.id.button11);
        socialconnect=findViewById(R.id.button21);
        engineering_mechanics=findViewById(R.id.button12);
        computer_science=findViewById(R.id.button13);
        engineering_design=findViewById(R.id.button16);

        chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl( "https://meet.google.com/akv-admx-ocu");
            }
        });
        maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://meet.google.com/ofm-ukfa-fpu");
            }
        });
        engineering_mechanics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://meet.google.com/ytr-pycj-fbm?authuser=0");
            }
        });
        computer_science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://meet.google.com/htt-esvo-cry");
            }
        });
        engineering_design.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://meet.google.com/jns-amfs-svp?authuser=0");
            }
        });
        socialconnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://meet.google.com/net-bxrs-mha");
            }
        });




        }
        private void gotoUrl(String s ){
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }

}
