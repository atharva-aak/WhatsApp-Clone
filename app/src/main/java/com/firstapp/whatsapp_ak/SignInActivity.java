package com.firstapp.whatsapp_ak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        Toast.makeText(SignInActivity.this,"this is the sing in page", Toast.LENGTH_SHORT).show();
    }
}
