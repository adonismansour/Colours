	package com.nonexample.colours;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mColourRegion = findViewById (R.id.colour_region);
		Button b1 = (Button)findViewById (R.id.button1);
		Button b2 = (Button)findViewById (R.id.button2);
		Button b3 = (Button)findViewById (R.id.button3);
		Radiobutton r1 = (Radiobutton)findViewById (R.id.radio0);
		Radiobutton r2 = (Radiobutton)findViewById (R.id.radio1);
		Radiobutton r3 = (Radiobutton)findViewById (R.id.radio2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
