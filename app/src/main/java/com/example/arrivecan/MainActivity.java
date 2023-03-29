package com.example.arrivecan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private SharedPreferences name,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1_main);

        name = getPreferences(Context.MODE_PRIVATE);
        pass = getPreferences(Context.MODE_PRIVATE);

        String ch = name.getString("leName", "rien");
        String nb = pass.getString("MDP", "rien");

        ((TextView)findViewById(R.id.editTextTextEmailAddress)).setText(ch);
        ((TextView)findViewById(R.id.editTextNumberPassword)).setText(nb);
    }

    public void clickEnter(View v){
        startActivity(new Intent(getApplicationContext(), GetStarted.class));
    }
}