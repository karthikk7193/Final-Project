package com.example.extstudent.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonSignIn = null;
    private Button buttonSignUp = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.buttonSignIn = (Button)findViewById(R.id.buttonSignIn);
        this.buttonSignUp = (Button)findViewById(R.id.buttonSignUp);


        this.buttonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.extstudent.finalproject.SignIn.class);
                startActivity(intent);
            }
        }); this.buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.extstudent.finalproject.SignUp.class);
                startActivity(intent);
            }
        });
}}
