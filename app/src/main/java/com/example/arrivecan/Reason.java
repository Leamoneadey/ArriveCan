package com.example.arrivecan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Reason extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3_reason);
    }

    public <View> void btnReason(View view) {
        startActivity(new Intent(getApplicationContext(), TransportActivity.class));
    }
}