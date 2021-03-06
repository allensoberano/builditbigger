package com.udacity.gradle.builditbigger.backend;

import com.example.android.javajokeslist.JavaJokes;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com"
        )
)
public class MyEndpoint {


    // An endpoint method that retrieves a joke from my java library
    @ApiMethod(name = "tellJoke")
    public MyBean tellJoke(){

        MyBean response = new MyBean();
        JavaJokes javaJokes = new JavaJokes();
        response.setData(javaJokes.getJoke());

        return response;
    }

}
