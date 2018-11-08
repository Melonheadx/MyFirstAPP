package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {
    private ListView lv;
    int i = 0;
    private List<String> list = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void chatButtonOnPress(View view){
        int n = ++this.i;
        Intent chatIntent = new Intent(this, MainActivity.class);
        this.list.add("Chat " + n);
        lv = (ListView) findViewById(R.id.listView3);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1, list
        );
        lv.setAdapter(arrayAdapter);

        lv.setSelection(arrayAdapter.getCount() - 1);
        startActivity(chatIntent);
    }
    public void drawerButtonOnPress(View view){
        Intent drawerIntent = new Intent(this, DrawerActivity.class);
        startActivity(drawerIntent);
    }

}
