package com.teamtreehouse.ribbit;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class SignUpActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sign_up);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.sign_up, menu);
		return true;
	}
}
