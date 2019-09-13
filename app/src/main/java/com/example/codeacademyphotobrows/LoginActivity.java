package com.example.codeacademyphotobrows;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editTextPass, editTextName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
        editTextName = findViewById(R.id.edit_text_login);
        editTextPass = findViewById(R.id.edit_text_password);
        button = findViewById(R.id.letsGoBtn);
        textView = findViewById(R.id.textRegister);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, Register.class);
                startActivity(intent);

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String userNames = editTextName.getText().toString();
                String userPass = editTextPass.getText().toString();
                SharedPreferences sharedPreferences = getSharedPreferences("MYPREFER", MODE_PRIVATE);




                String userDetails = sharedPreferences.getString(userNames + userPass + "data", "Username or password is incorrect");

               if ( userNames==sharedPreferences.getString("MYPREFER", String.valueOf(MODE_PRIVATE)))
               {
                   openActivityForHome();
               }
               else {
                   Toast.makeText(LoginActivity.this,"Username or password is incorrect", Toast.LENGTH_LONG);
               }




            }
        });
    }

    public void openActivityForHome() {
        Intent intent = new Intent(this, HomeActivityThe.class);
        startActivity(intent);

    }
}
