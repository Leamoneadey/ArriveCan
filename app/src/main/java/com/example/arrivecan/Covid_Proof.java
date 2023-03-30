package com.example.arrivecan;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Covid_Proof extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity8_covid_proof);

        TextView q2TextView = findViewById(R.id.med_tv);
        CardView q2CardView = findViewById(R.id.med_card);

        //Fonction qui permet de montrer la question 2 si la réponse de la question 1 est "non"
        Button noButton = findViewById(R.id.no_button);
        noButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q2TextView.setVisibility(View.VISIBLE);
                q2CardView.setVisibility(View.VISIBLE);
            }
        });

    }
}
