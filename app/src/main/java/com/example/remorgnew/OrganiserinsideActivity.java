package com.example.remorgnew;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class OrganiserinsideActivity extends AppCompatActivity {
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organiserinside);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(OrganiserinsideActivity.this,organiserforcs_ai_ee.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(OrganiserinsideActivity.this,organiserforcs_ai_ee.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.button7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(OrganiserinsideActivity.this,organiserforcs_ai_ee.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(OrganiserinsideActivity.this,organiser_restbranches.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(OrganiserinsideActivity.this,organiser_restbranches.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.button8);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(OrganiserinsideActivity.this,organiser_restbranches.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.button9);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(OrganiserinsideActivity.this,organiser_restbranches.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.button10);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(OrganiserinsideActivity.this,organiser_restbranches.class);
                startActivity(intent);
            }
        });




    }
}