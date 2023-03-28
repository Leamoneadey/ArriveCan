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

    public <View> void clickEnter(View view) {
        startActivity(new Intent(getApplicationContext(), CreateAccount.class));
    }
}