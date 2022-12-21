package com.example.remorgnew;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class frontpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView username=(TextView) findViewById(R.id.mail);
        TextView password=(TextView) findViewById(R.id.password);


        MaterialButton loginbtn = (MaterialButton)  findViewById(R.id.loginbtn);

        // admin and admin
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("IITJ") && password.getText().toString().equals("12345")){
                    //correct
                    Toast.makeText(getApplicationContext(), "LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                }else
                    //incorect
                    Toast.makeText(getApplicationContext(),"LOGIN FAIL !!! " , Toast.LENGTH_SHORT).show();

            }
        });


    }
}