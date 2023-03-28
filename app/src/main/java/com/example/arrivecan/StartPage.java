package com.example.arrivecan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class StartPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_start);
    }

    public <View> void clickEnter(View view){
        startActivity(new Intent(getApplicationContext(), TransportActivity.class));
    }
}