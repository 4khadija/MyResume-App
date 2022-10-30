package com.example.myresume;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Certification extends AppCompatActivity {
    ListView l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certification);
        l = (ListView) findViewById(R.id.list);
        ArrayList<String> a = new ArrayList<>();
        a.add("Introduction to Python Programming");
        a.add("Java Programming Solving Problems with Software");
        a.add("Data Science");
        a.add("Introduction to SQL");
        a.add("Applied machine learning in python");
        ArrayAdapter arr;
        arr = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1,a);
        l.setAdapter(arr);


    }
}
