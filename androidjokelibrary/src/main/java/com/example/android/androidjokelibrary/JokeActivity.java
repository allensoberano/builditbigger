package com.example.android.androidjokelibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class JokeActivity extends AppCompatActivity {

    private String javaJoke;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getIntent().getExtras() != null){
            //javaJoke = getIntent().getStringExtra(JokeActivity.JOKE_KEY);
        }
    }
}
