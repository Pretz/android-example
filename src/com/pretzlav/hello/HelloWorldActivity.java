package com.pretzlav.hello;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;

public class HelloWorldActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void awesomeness(View v) {
    	new AlertDialog.Builder(this)
    		.setTitle("This is an awesome dialog.")
    		.setPositiveButton("OMG A BUTT0nZ", null)
    		.create()
    		.show();
    }
}