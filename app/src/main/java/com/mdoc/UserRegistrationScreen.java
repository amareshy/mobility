package com.mdoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class UserRegistrationScreen extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {
    private Button mSignInButton;
    private Spinner mSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registration_screen);

        mSignInButton = (Button) findViewById(R.id.signInButton);
        mSignInButton.setOnClickListener(this);


        List<String> categories = new ArrayList<String>();
        categories.add("Current Location");
        categories.add("Allahabad");
        categories.add("Delhi");
        categories.add("Faridabad");
        categories.add("Gurugram");

        mSpinner = (Spinner) findViewById(R.id.select_location);
        mSpinner.setOnItemSelectedListener(this);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item, categories);
        mSpinner.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.signInButton:
                Intent intent = new Intent(this, LoginScreen.class);
                startActivity(intent);
        }
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
}
