package com.example.c_89983.voting_iupui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class state_races extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.state_races);
    }

    public void show_US_SENATE(View view) {
        Intent intent = new Intent(state_races.this, state_senate.class);
        startActivity(intent);
    }

    public void show_house_canditates(View view) {
        Intent intent = new Intent(state_races.this, state_house.class);
        startActivity(intent);
    }


}

