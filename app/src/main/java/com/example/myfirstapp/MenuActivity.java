package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void chatButtonOnPress(View view){
        Intent chatIntent = new Intent(this, MainActivity.class);
        startActivity(chatIntent);
    }
    public void drawerButtonOnPress(View view){
        Intent drawerIntent = new Intent(this, DrawerActivity.class);
        startActivity(drawerIntent);
    }
}
