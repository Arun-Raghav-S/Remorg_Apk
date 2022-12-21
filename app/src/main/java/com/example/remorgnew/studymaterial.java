package com.example.remorgnew;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class studymaterial extends AppCompatActivity {
    public Button button30;
    public Button button31;
    public Button button32;
    public Button button33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studymaterial);

        button30=(Button) findViewById(R.id.button30);
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(studymaterial.this,studymaterial1.class);
                startActivity(intent);

            }
        });

        button31=(Button) findViewById(R.id.button31);
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(studymaterial.this,studymaterial2.class);
                startActivity(intent);

            }
        });

        button32=(Button) findViewById(R.id.button32);
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(studymaterial.this,studymaterial3.class);
                startActivity(intent);

            }
        });

        button33=(Button) findViewById(R.id.button33);
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(studymaterial.this,studymaterial4.class);
                startActivity(intent);

            }
        });

    }
}