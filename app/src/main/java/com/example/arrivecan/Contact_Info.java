package com.example.arrivecan;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.android.material.textfield.TextInputLayout;

import java.util.Calendar;

public class Contact_Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity7_contact_info);

        /*-----------------------------Code pour date of birth-------------------------------*/

        //Définir les variables (date of birth)
        TextInputLayout dateOfBirthLayout = findViewById(R.id.add_date);
        EditText dateOfBirthEditText = findViewById(R.id.add_date2);

        dateOfBirthLayout.setEndIconOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        Contact_Info.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                                // Set the selected date to the EditText
                                String date = dayOfMonth + "/" + (month + 1) + "/" + year;
                                dateOfBirthEditText.setText(date);
                            }
                        },
                        year, month, day);

                // Show the DatePickerDialog
                datePickerDialog.show();
            }
        });

        /*-----------------------------Code pour document type-------------------------------*/

        //Définir les variables (document type)
        String[] documentList = getResources().getStringArray(R.array.documentList);//Tableau dans strings.xml file
        Spinner docTypeSpinner = findViewById(R.id.doc_type_spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, documentList);
        docTypeSpinner.setAdapter(adapter);

        docTypeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // code lorsque le document est sélectionné
                String selectedDocument = documentList[position];
                // faire qqchose avec le doc selectionné: utiliser sharedPreferences to save the data
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // do nothing
            }
        });

        // Fonction lorsque le spinner est sélectionner
        docTypeSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                docTypeSpinner.performClick();
            }
        });
    }

    /*-----------------------------Code pour button to go to next activity-------------------------------*/

    public <View> void btnContact(View view) {
        startActivity(new Intent(getApplicationContext(), CreateAccount.class));
    }
}
