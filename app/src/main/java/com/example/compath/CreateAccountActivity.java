package com.example.compath;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CreateAccountActivity extends AppCompatActivity {

    Button createAccountButton;
    String name,id,pw;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_create_account);

        createAccountButton = findViewById(R.id.create_account_button);

        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //loginActivity와는 살짝 다른 방식으로 해봤는데, EditText객체를 만들어봤자 그냥 getText하는거 말고는 쓸일이 없음.
                //그래서 코드만 많아보이고 산만해서 약간 낭비인 감이 있어서 아래처럼 바꿔봄.
                //자바의 casting 개념이랑 관계가 깊은데, 보고 이해하면 좋을듯!

                name = ((EditText)findViewById(R.id.new_name_input)).getText().toString();
                id = ((EditText)findViewById(R.id.new_id_input)).getText().toString();
                pw = ((EditText)findViewById(R.id.new_pw_input)).getText().toString();

            }
        });
    }

}
