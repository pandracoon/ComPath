package com.example.compath;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CreateaccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_createaccount);
    }

    public void Create(View v){
        EditText new_name_input = (EditText)findViewById(R.id.new_name_input);
        EditText new_id_input = (EditText)findViewById(R.id.new_id_input);
        EditText new_pw_input = (EditText)findViewById(R.id.new_pw_input);

        final String new_NAME = new_name_input.getText().toString();
        final String new_ID = new_id_input.getText().toString();
        final String new_PW = new_pw_input.getText().toString();

    }
}
