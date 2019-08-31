package com.example.codeacademyphotobrows;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {
private static int PLAY_SPELSH_SCREEN=5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
         setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                openActivityForSpl();
                finish();

            }
        },PLAY_SPELSH_SCREEN);


    }
    public void openActivityForSpl(){
        Intent intent=new Intent(this,LoginActivity.class);
        startActivity(intent);

    }
}
