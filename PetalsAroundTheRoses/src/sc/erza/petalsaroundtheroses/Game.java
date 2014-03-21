package sc.erza.petalsaroundtheroses;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Game extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game);
	}

	private int throwDice() {
		int randInt = (int)(Math.random() * 7 + 1);
		return randInt;
	}
	
	public void showThrow(View view) {
		ImageView imageview1 = (ImageView) findViewById(R.id.imageView1);
		switch(throwDice()) {
		case 1: 
				imageview1.setImageResource(R.drawable.one);
				break;
				
		case 2:
				imageview1.setImageResource(R.drawable.two);
				break;
				
		case 3:
				imageview1.setImageResource(R.drawable.three);
				break;
				
		case 4:
				imageview1.setImageResource(R.drawable.four);
				break;
			
		case 5:
				imageview1.setImageResource(R.drawable.five);
				break;
			
		case 6:
				imageview1.setImageResource(R.drawable.six);
				break;
		}
	}
}
