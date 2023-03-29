package com.example.arrivecan;

import static java.security.AccessController.getContext;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;

import java.util.Calendar;

public class Arrival_Flight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity6_arrival_flight);
    }

    //Fonction qui permet de cliquer sur le TextView pour aller sur une page web d'une liste d'aéroport
    public void onAirportsLinkClicked(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Lists_of_airports"));
        startActivity(browserIntent);
    }
}

