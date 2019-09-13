package com.example.codeacademyphotobrows;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Register extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.register);
     final EditText editTextName = findViewById(R.id.editTextWriteName);
     final EditText editTextPass = findViewById(R.id.editTextWritePass);
     final EditText editTextEmail = findViewById(R.id.editTextWriteEmail);
        Button buttonRegister = findViewById(R.id.btnRegister);


        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences  preferences =getSharedPreferences("MYPREFER",MODE_PRIVATE);
                String userName =editTextName.getText().toString();
                String userPass =editTextPass.getText().toString();
                String userEmail =editTextEmail.getText().toString();
           SharedPreferences.Editor editor=preferences.edit();
           editor.putString(userName + userPass +"data ",userName+"\n"+ userEmail);
editor.commit();
                Intent intent = new Intent(Register.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

}
