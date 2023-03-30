package com.example.arrivecan;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

import java.util.Calendar;

public class Arrival_Flight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity6_arrival_flight);

        TextInputLayout arrivalDateLayout = findViewById(R.id.arrival_date_layout);
        EditText arrivalDateEditText = findViewById(R.id.arrival_date_edittext);

        arrivalDateLayout.setEndIconOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        Arrival_Flight.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                                // Set the selected date to the EditText
                                String date = dayOfMonth + "/" + (month + 1) + "/" + year;
                                arrivalDateEditText.setText(date);
                            }
                        },
                        year, month, day);

                // Show the DatePickerDialog
                datePickerDialog.show();
            }
        });
    }

    //Fonction qui permet de cliquer sur le TextView pour aller sur une page web d'une liste d'aéroport
    public void onAirportsLinkClicked(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Lists_of_airports"));
        startActivity(browserIntent);
    }

    public <View> void btnArrival(View view) {
        startActivity(new Intent(getApplicationContext(), Contact_Info.class));
    }
}

