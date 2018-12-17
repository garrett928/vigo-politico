package com.example.c_89983.voting_iupui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class county_races extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.county);


    }

    public void show_commissioner(View view){
        Intent intent = new Intent(county_races.this, county_commissioner_can.class);
        startActivity(intent);
    }
    public void show_council1(View view){
        Intent intent = new Intent(county_races.this, county_council1_can.class);
        startActivity(intent);
    }

    public void show_council2(View view){
        Intent intent = new Intent(county_races.this, county_council2_can.class);
        startActivity(intent);
    }

    public void show_council3(View view){
        Intent intent = new Intent(county_races.this, county_council3_can.class);
        startActivity(intent);
    }
    public void show_council4(View view){
        Intent intent = new Intent(county_races.this, county_council4_can.class);
        startActivity(intent);
    }
}
