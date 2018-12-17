package com.example.c_89983.voting_iupui;

import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelUuid;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;

public class federal_races extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.federal);

    }
    public void show_US_SENATE(View view){
        Intent intent = new Intent(federal_races.this,senate_canditates.class);
        startActivity(intent);
    }
    public void show_house_canditates(View view){
        Intent intent = new Intent(federal_races.this, house_canditates.class);
        startActivity(intent);
    }

}