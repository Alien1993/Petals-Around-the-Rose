package sc.erza.petalsaroundtheroses;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Rules extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rules);
	}
	
	public void play(View view) {
		Intent intent = new Intent(this, Game.class);
		startActivity(intent);
	}
	
}