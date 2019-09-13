package com.example.codeacademyphotobrows;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ContentResolver;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toolbar;

import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private RecyclerView imageitem;
    private RecyclerView numberList;
    private ImageAdapter imageAdapter;
private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home);
        numberList= findViewById(R.id.recycleimageid);


        RecyclerView.LayoutManager layoutManager = new RecyclerView.LayoutManager() {
            @Override
            public RecyclerView.LayoutParams generateDefaultLayoutParams() {
                return null;
            }
        };
        numberList.setLayoutManager(layoutManager);
        numberList.setHasFixedSize(true);

         //imageAdapter= new ImageAdapter();
        final ContentResolver resolver =  getContentResolver();

        Cursor cursor = null;



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_exit,menu);
        return true;
    }
}
