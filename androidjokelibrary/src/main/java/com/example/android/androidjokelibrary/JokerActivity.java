package com.example.android.androidjokelibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class JokerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joker);

        String javaJoke;
        if (getIntent().getExtras() != null){

           javaJoke = getIntent().getStringExtra("joke");

           ///NEXT: DISPLAY JOKE IN TEXTVIEW ON ACTIVITY
        }
    }
}
