package com.example.arrivecan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class CovidTest_Arrival extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity5_covid_test_arrival);
    }

    public <View> void btnCovid(View view) {
        startActivity(new Intent(getApplicationContext(), Arrival_Flight.class));
    }
}