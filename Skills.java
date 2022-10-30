package com.example.myresume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView;

import java.util.ArrayList;

public class Skills extends AppCompatActivity {
    ListView l1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);
        l1 = (ListView) findViewById(R.id.list);
        ArrayList<String> a = new ArrayList<>();
        a.add("Java");
        a.add("Python");
        a.add("Data Science");
        a.add("Oracle DataBase");
        a.add("SQL");
        a.add("C++");
        a.add("DBMS");
        a.add("Web Development");
        a.add("App Development");

        ArrayAdapter arr;
        arr = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, a);
        l1.setAdapter(arr);
    }
}
