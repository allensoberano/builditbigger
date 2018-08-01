package com.example.android.javajokes;

import java.util.ArrayList;
import java.util.List;

public class javaJokes {

    String joke1 = "Knock Knock. Who's there? \n Lettuce. Lettuce who? \n Lettuce hurry up and finish this project";
    String joke2 = "A man tells his doctor that his arms are hurting in 2 different places. \n Doctor tells him...not to go to those places.";
    String joke3 = "Knock knock.\n Race condition.\n Who's there?";
    List<String> jokeArray = new ArrayList<>();


    public String getJoke(){

        jokeArray.add(joke1);
        jokeArray.add(joke2);
        jokeArray.add(joke3);

        int index = (int)Math.floor(Math.random() * 2);

        return jokeArray.get(index);
    }
}
