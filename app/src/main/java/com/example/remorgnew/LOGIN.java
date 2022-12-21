package com.example.remorgnew;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;

public class LOGIN extends AppCompatActivity {
    private DatabaseHelper databaseHelper;
    TextInputLayout email_lay,pass_lay;
    TextInputEditText usermail,password;
    private FirebaseAuth mauth;
    private GoogleSignInClient googleSignInClient;
    private GoogleSignInOptions googleSignInOptions;
    private InputValidation inputValidation;
    Button googlesignin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        getSupportActionBar().hide();
        googleSignInOptions=new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        googleSignInClient= GoogleSignIn.getClient(this,googleSignInOptions);
        email_lay=(TextInputLayout)findViewById(R.id.loginmail);
        pass_lay=(TextInputLayout)findViewById(R.id.loginpass);
        usermail=(TextInputEditText)findViewById(R.id.lomail);
        password=(TextInputEditText)findViewById(R.id.password);
        googlesignin=(Button)findViewById(R.id.googleSignin);
        databaseHelper=new DatabaseHelper(LOGIN.this);
        inputValidation=new InputValidation(LOGIN.this);
        googlesignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignIn();
            }
        });
     //   TextView usermail=(TextView) findViewById(R.id.mail);
     //   TextView password=(TextView) findViewById(R.id.password);
       TextView signup=(TextView)findViewById(R.id.signup);

        Button loginbtn = (Button)  findViewById(R.id.loginbtn);

        // admin and admin
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mail=usermail.getText().toString().trim();
                String pass=password.getText().toString().trim();
                if(!inputValidation.isInputEditTextFilled(usermail,email_lay,"Enter Valid Email"))
                {return;}
                if(!inputValidation.isInputEditTextEmail(usermail,email_lay,"Enter Valid Email"))
                {return;}
                if(!inputValidation.isInputEditTextFilled(password,pass_lay,"Enter Password"))
                {return;}
                if (!databaseHelper.checkUser(mail)){
                    usermail.setError("Email Id does not exist");
                    return;
                }
             if(!databaseHelper.checkPassword(mail,pass)){
                   password.setError("Wrong Password");
                   return;
                }
          //     if(!pass.equals(databaseHelper.checkPassword(mail)))
            //    {
              //      Toast.makeText(getApplicationContext(),"LOGIN FAIL !!! " , Toast.LENGTH_SHORT).show();
           //   }
                Intent intent=new Intent(getApplicationContext(), Dashboard.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();

                    //incorect
                   // Toast.makeText(getApplicationContext(),"LOGIN FAIL !!! " , Toast.LENGTH_SHORT).show();


            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Register.class);
                startActivity(intent);
            }
        });
    }

    private void SignIn() {
        Intent intent=googleSignInClient.getSignInIntent();
        startActivityForResult(intent,100);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==100){
            Task<GoogleSignInAccount>task=GoogleSignIn.getSignedInAccountFromIntent(data);
            try {
                task.getResult(ApiException.class);
                HomeActivity();
            } catch (ApiException e) {

            }
        }
    }
    int c=1;
    private void HomeActivity() {
        finish();
        GoogleSignInAccount account=GoogleSignIn.getLastSignedInAccount(getApplicationContext());
        if(account!=null){
            String Mail=account.getEmail();
            String domain=Mail.substring(Mail.indexOf('@')+1);
            if (!domain.equals("iitj.ac.in")){
                Toast.makeText(getApplicationContext(),"Sign in using IITJ mail id",Toast.LENGTH_SHORT).show();
                finish();
                googleSignInClient.signOut();
               startActivity(new Intent(getApplicationContext(),LOGIN.class));
            }else{
                Intent intent=new Intent(getApplicationContext(),Dashboard.class);
                startActivity(intent);}
        }
    }
}
