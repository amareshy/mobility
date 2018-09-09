package com.mdoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class EducationScreen extends AppCompatActivity implements View.OnClickListener {
    private Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_education_screen);
        myButton = (Button) findViewById(R.id.let_start_button);
        myButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.let_start_button:
                Intent intent = new Intent(this, MobileOTPVeifyScreen.class);
                startActivity(intent);
        }
    }
}
