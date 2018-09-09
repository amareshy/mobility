package com.mdoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;

public class SplashScreen extends AppCompatActivity {
    private boolean flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        flag = false;
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (!flag) {
            Intent intent = new Intent(this, SelectLanguageScreen.class);
            startActivity(intent);

            flag = true;
        }

        return super.onTouchEvent(event);
    }
}
