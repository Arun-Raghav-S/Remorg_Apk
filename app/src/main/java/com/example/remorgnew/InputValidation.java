package com.example.remorgnew;

import android.content.Context;
import android.util.Patterns;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class InputValidation {
    private Context context;

    public InputValidation(Context context) {
        this.context = context;
    }
    public boolean isInputEditTextFilled(TextInputEditText textInputEditText, TextInputLayout textInputLayout,String message){
        String value=textInputEditText.getText().toString().trim();
        if(value.isEmpty()) {
            textInputEditText.setError(message);
            hideKeyboardFrom(textInputEditText);
            return false;
        }
        else{
            textInputLayout.setErrorEnabled(false);
        }
       return true;

    }
    public boolean isInputEditTextEmail(TextInputEditText textInputEditText,TextInputLayout textInputLayout,String message){
        String value=textInputEditText.getText().toString().trim();
        if(value.isEmpty()|| !Patterns.EMAIL_ADDRESS.matcher(value).matches()) {
            textInputEditText.setError(message);
            hideKeyboardFrom(textInputEditText);
            return false;
        }
        String domain=value.substring(value.indexOf('@')+1);
        if (!domain.equals("iitj.ac.in")){
            textInputEditText.setError("Enter IITJ email id");
            hideKeyboardFrom(textInputEditText);
            return false;
        }
        else{
            textInputLayout.setErrorEnabled(false);

        }
        return true;

    }
    public boolean isInputEditTextMatches(TextInputEditText textInputEditText1,TextInputEditText textInputEditText2,TextInputLayout textInputLayout,String message){
        String value1= textInputEditText1.getText().toString().trim();
        String value2= textInputEditText2.getText().toString().trim();
        if(value1.isEmpty()){
            textInputLayout.setError("Enter Password");
            hideKeyboardFrom(textInputEditText1);
            return  false;
        }
        if(value2.isEmpty()){
            textInputLayout.setError("Confirm Password");
            hideKeyboardFrom(textInputEditText2);
            return  false;
        }
        if(!value1.contentEquals(value2)){
            textInputLayout.setError(message);
            hideKeyboardFrom(textInputEditText2);
            return  false;
        }else{
            textInputLayout.setErrorEnabled(false);
        }
        return true;

    }
    private void hideKeyboardFrom(View view){


    }

}
