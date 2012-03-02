package com.pretzlav.hello;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ActivityListActivity extends ListActivity {

	enum Activities {
		HELLO1("1. Hello, World", Hello1.class),
		HELLO2("2. Hello, Button", Hello2.class),
		HELLO3("3. Hello, Button Try 2", HelloWorldActivity.class),
		HELLO4("4. Yelp Search Button", Hello3.class),
		SEARCH("5. Yelp Search 2", SearchBarActivity.class);

		public final String name;
		public final Class<? extends Activity> activity;

		private Activities(String name, Class<? extends Activity> activity) {
			this.name = name;
			this.activity = activity;
		}

		@Override
		public String toString() {
			return this.name;
		}
	}

	private final Activities[] activities = Activities.values();

	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		getListView().setAdapter(new ArrayAdapter<Activities>(this, android.R.layout.simple_list_item_1, activities));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		Class<? extends Activity> activityClass = activities[position].activity;
		startActivity(new Intent(this, activityClass));
	}
}
