package com.example.compath;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);
    }

    public void Login(View v){
        EditText id = (EditText)findViewById(R.id.id_input);
        EditText pw = (EditText)findViewById(R.id.password_input);

        final String ID = id.getText().toString();
        final String PW = pw.getText().toString();

        if(ID == "compath" && PW == "123456"){
            Intent intent = new Intent(this, LoadingActivity.class);
            startActivity(intent);
        }
    }
}
