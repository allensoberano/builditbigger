package com.example.android.androidjokelibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joker);

        TextView textView = findViewById(R.id.tv_joke);
        String javaJoke;
        if (getIntent().getExtras() != null){

           javaJoke = getIntent().getStringExtra("joke");

            textView.setText(javaJoke);
           ///NEXT: DISPLAY JOKE IN TEXTVIEW ON ACTIVITY
        }
    }
}
