package com.example.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lv;

    List<String> list = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendMessage(View view){

            EditText editText = (EditText) findViewById(R.id.editText);

            String message = editText.getText().toString();

        lv = (ListView) findViewById(R.id.listView2);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1, list
        );

            list.add(message);
            lv.setAdapter(arrayAdapter);

            TextView textView = findViewById(R.id.textView);
            textView.setText("You typed: " + message);
            editText.getText().clear();
            lv.setSelection(arrayAdapter.getCount() - 1);

    }
}
