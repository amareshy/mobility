package com.mdoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class SelectLanguageScreen extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {
    private Spinner mySpinner;
    private Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_select_language_screen);


        myButton = (Button) findViewById(R.id.goButton);
        myButton.setOnClickListener(this);

        List<String> categories = new ArrayList<String>();
        categories.add("Select Language");
        categories.add("English");
        categories.add("Hindi");
        categories.add("Tamil");
        categories.add("Malyalam");
        categories.add("Gujrati");
        categories.add("Kannad");
        categories.add("Udiya");
        categories.add("Bengali");
        categories.add("Panjabi");
        categories.add("Marathi");

        mySpinner = (Spinner) findViewById(R.id.select_lang_spinner);
        mySpinner.setOnItemSelectedListener(this);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item,categories);
        mySpinner.setAdapter(adapter);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.goButton:
                finish();
                Intent intent = new Intent(this, EducationScreen.class);
                startActivity(intent);
        }
    }
}
