package com.udacity.gradle.builditbigger.backend;

import com.example.android.javajokeslist.JavaJokes;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {
        return myData;
    }

    public void setData(String data) {

            JavaJokes javaJokes = new JavaJokes();
            myData = javaJokes.getJoke();
        //myData = data;
    }
}