package com.mdoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserRegistrationScreen extends AppCompatActivity implements View.OnClickListener{
private Button mSignInButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registration_screen);

        mSignInButton = (Button) findViewById(R.id.signInButton);
        mSignInButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.signInButton:
                Intent intent = new Intent(this, LoginScreen.class);
                startActivity(intent);
        }
    }
}
