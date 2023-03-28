package com.example.arrivecan;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class TransportActivity extends AppCompatActivity {

    private TextView transportTextView, selectEntryModeTextView;
    private RadioGroup entryModeRadioGroup;
    private RadioButton entryByAirRadioButton, entryByLandRadioButton, entryByMarineRadioButton;
    private Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4_transport);

        transportTextView = findViewById(R.id.transport);
        selectEntryModeTextView = findViewById(R.id.select_entry_mode_textview);
        entryModeRadioGroup = findViewById(R.id.entry_mode_radiogroup);
        entryByAirRadioButton = findViewById(R.id.entry_by_air_radiobutton);
        entryByLandRadioButton = findViewById(R.id.entry_by_land_radiobutton);
        entryByMarineRadioButton = findViewById(R.id.entry_by_marine_radiobutton);
        nextButton = findViewById(R.id.next_button);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = entryModeRadioGroup.getCheckedRadioButtonId();

                if (selectedId == entryByAirRadioButton.getId()) {
                    // Handle entry by air
                    transportTextView.setText("Entry by air selected");
                    selectEntryModeTextView.setVisibility(View.GONE);
                    entryModeRadioGroup.setVisibility(View.GONE);
                } else if (selectedId == entryByLandRadioButton.getId()) {
                    // Handle entry by land
                    transportTextView.setText("Entry by land selected");
                    selectEntryModeTextView.setVisibility(View.GONE);
                    entryModeRadioGroup.setVisibility(View.GONE);
                } else if (selectedId == entryByMarineRadioButton.getId()) {
                    // Handle entry by marine
                    transportTextView.setText("Entry by marine selected");
                    selectEntryModeTextView.setVisibility(View.GONE);
                    entryModeRadioGroup.setVisibility(View.GONE);
                } else {
                    // No option selected
                    Toast.makeText(TransportActivity.this, "Please select an entry mode", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
