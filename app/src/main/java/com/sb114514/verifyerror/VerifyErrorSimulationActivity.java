package com.sb114514.verifyerror;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;
import android.view.View;

public class VerifyErrorSimulationActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_error_simulation);
        Intent intent = getIntent();
        ((TextView) findViewById(R.id.ves_title)).setText(intent.getStringExtra("title"));
        ((TextView) findViewById(R.id.ves_content)).setText(intent.getStringExtra("content"));
        ((TextView) findViewById(R.id.ves_i_know)).setText(intent.getStringExtra("i_know"));
        ((TextView) findViewById(R.id.ves_i_know)).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
    }
}
