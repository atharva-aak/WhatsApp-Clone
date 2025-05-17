package com.firstapp.whatsapp_ak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Toast.makeText(SignInActivity.this,"this is the main acitivity", Toast.LENGTH_SHORT).show();
    }
}
