package com.pretzlav.hello;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Hello3 extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void awesomeness(View v) {
    	startActivity(new Intent(this, YelpSearchActivity.class));
    }

}