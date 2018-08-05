package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.android.javajokeslist.JavaJokes;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //new EndpointsAsyncTask().execute(new Pair<Context, String>(this, "Manfred"));
        //new EndpointsAsyncTask().execute(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public String tellJoke() {

        JavaJokes javaJokes = new JavaJokes();
        return javaJokes.getJoke();

       // Toast.makeText(this, javaJokes.getJoke(), Toast.LENGTH_SHORT).show();
    }

    public void getJoke(){
        new EndpointsAsyncTask().execute(this);
    }

    public void launchLibraryActivity(View view){

        getJoke();

    }


}
