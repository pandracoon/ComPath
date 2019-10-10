package com.example.compath;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    Button loginButton, createAccountButton;
    EditText idEditText, pwEditText;
    String id, pw;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);

        loginButton = findViewById(R.id.login_button);
        createAccountButton = findViewById(R.id.button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                idEditText = findViewById(R.id.id_input);
                pwEditText = findViewById(R.id.password_input);

                id = idEditText.getText().toString();
                pw = pwEditText.getText().toString();

                if (pw.equals("123456") && id.equals("compath")) {
                    Intent intent = new Intent(getApplicationContext(), LoadingActivity.class);
                    startActivity(intent);
                } else {

                }
            }
        });

        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CreateAccountActivity.class);
                startActivity(intent);
            }
        });

    }

}
