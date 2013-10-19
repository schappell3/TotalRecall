package edu.vt.cs5744.android.totalrecall;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class RecallActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_recall);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		// Test, Test
		getMenuInflater().inflate(R.menu.recall, menu);
		return true;
	}

}
