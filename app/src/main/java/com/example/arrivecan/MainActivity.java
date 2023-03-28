package com.example.arrivecan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1_main);
    }

    public <View> void clickEnter(View view){
        startActivity(new Intent(getApplicationContext(), StartPage.class));
    }
}