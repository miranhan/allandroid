package kr.example.exaple1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class Example1Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.example1, menu);
		return true;
	}

	public void myClickHandler(View v) {
		switch(v.getId()){
		case R.id.button1:
			Toast.makeText(Example1Activity.this, "가위를 누르셨습니다.", Toast.LENGTH_SHORT).show();
			break;
		case R.id.button2:
			Toast.makeText(Example1Activity.this, "바위를 누르셨습니다.", Toast.LENGTH_SHORT).show();
			break;
		case R.id.button3:
			Toast.makeText(Example1Activity.this, "보를 누르셨습니다.", Toast.LENGTH_SHORT).show();
			break;
		}
    }
	
}
