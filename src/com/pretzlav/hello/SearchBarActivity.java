package com.pretzlav.hello;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SearchBarActivity extends Activity {

	private EditText mSearchTerm;
	private EditText mSearchLocation;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.search_layout);
		setTitle("Search teh yelpz");
		mSearchTerm = (EditText)findViewById(R.id.searchTerm);
		mSearchLocation = (EditText)findViewById(R.id.searchLocation);
	}

	public void search(View v) {
		String term = mSearchTerm.getText().toString();
		String location = mSearchLocation.getText().toString();
		Intent intent = new Intent(this, YelpSearchListActivity.class);
		intent.setData(new Uri.Builder().appendQueryParameter("term", term).appendQueryParameter("location", location).build());
		startActivity(intent);
	}


}
