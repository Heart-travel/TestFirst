package com.example.testfirst;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class FirstActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
		Intent intent = getIntent();
		String data = intent.getStringExtra("extra_data");
		Log.d("FirstActivity", data);
	}

}
