package com.example.extstudent.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignIn extends AppCompatActivity {
    private Button buttonSignUp = null;
    private Button buttonMain = null;
    private Button buttonSubmit = null;
    private EditText editUsername = null;
    private EditText editPassword = null;
    private TextView textViewError = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        this.buttonSignUp = (Button)findViewById(R.id.buttonSignUp);
        this.buttonMain = (Button)findViewById(R.id.buttonMain);
        this.buttonSubmit = (Button)findViewById(R.id.buttonSubmit);

        textViewError = findViewById(R.id.textViewError);

        textViewError.setVisibility(View.INVISIBLE);


        this.buttonMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignIn.this, com.example.extstudent.finalproject.MainActivity.class);
                startActivity(intent);
            }
        });
        this.buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignIn.this, com.example.extstudent.finalproject.SignUp.class);
                startActivity(intent);
            }
        });

        this.buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editUsername = findViewById(R.id.editUsername);
                editPassword = findViewById(R.id.editPassword);
                if (ValidateUser(editUsername.getText().toString(), editPassword.getText().toString())) {
                    textViewError.setVisibility(View.INVISIBLE);
                    Intent intent = new Intent(SignIn.this, com.example.extstudent.finalproject.SubmitSignIn.class);
                    startActivity(intent);
                }
                else
                    textViewError.setVisibility(View.VISIBLE);
            }
        });

    }

    public boolean ValidateUser(String userName, String password)
    {

        boolean validUser = false;

        if (userName.equalsIgnoreCase("karthik")  && password.equals("7193"))
            validUser = true;
        else if (userName.equalsIgnoreCase("kumar")  && password.equals("abc123"))
            validUser = true;

        return validUser;    }
}
