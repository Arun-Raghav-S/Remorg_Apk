package com.example.remorgnew;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class organiser_restbranches extends AppCompatActivity {

    Button electrical_engineering;
    Button maths;
    Button bioengineering;
    Button electromagnetics;
    Button socialconnect;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organiser_restbranches);
        electrical_engineering=findViewById(R.id.button17);
        maths=findViewById(R.id.button18);
        bioengineering=findViewById(R.id.button19);
        electromagnetics=findViewById(R.id.button20);
        socialconnect=findViewById(R.id.button21);

        electrical_engineering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl( "https://meet.google.com/hbp-pqmx-now");
            }
        });
        maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://meet.google.com/ofm-ukfa-fpu");
            }
        });
        bioengineering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://meet.google.com/dye-txia-zyu");
            }
        });
        electromagnetics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://meet.google.com/vei-pcdr-kap");
            }
        });
        socialconnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://meet.google.com/net-bxrs-mha");
            }
        });
    }
    private void gotoUrl(String s ) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}