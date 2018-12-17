package com.example.c_89983.voting_iupui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class sendlocations extends AppCompatActivity {
    ListView lv = (ListView) findViewById(R.id.listview);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sendlocations);

        List<String> arrayList = new ArrayList<String>();
        arrayList.add("District 1");
        arrayList.add("District 2");
        arrayList.add("District 3");
        arrayList.add("District 4");
        arrayList.add("District 5");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                arrayList);

        lv.setAdapter(arrayAdapter);
    }
}
