package com.sb114514.verifyerror;
 
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends Activity { 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		findViewById(R.id.main_confirm).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, VerifyErrorSimulationActivity.class);
				intent.putExtra("title", ((EditText) findViewById(R.id.main_title)).getText().toString());
				intent.putExtra("content", ((EditText) findViewById(R.id.main_content)).getText().toString());
				intent.putExtra("i_know", ((EditText) findViewById(R.id.main_i_know)).getText().toString());
				startActivity(intent);
			}
		});
    }
}
