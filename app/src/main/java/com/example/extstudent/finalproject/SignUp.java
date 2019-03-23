package com.example.extstudent.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp extends AppCompatActivity {
    private Button buttonSignIn = null;
    private Button buttonMain = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        this.buttonSignIn = (Button)findViewById(R.id.buttonSignIn);
        this.buttonMain = (Button)findViewById(R.id.buttonMain);


        this.buttonMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp.this, com.example.extstudent.finalproject.MainActivity.class);
                startActivity(intent);
            }
        });
        this.buttonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp.this, com.example.extstudent.finalproject.SignIn.class);
                startActivity(intent);
            }
        });
    }
}
