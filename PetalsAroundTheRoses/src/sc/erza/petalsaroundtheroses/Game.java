package sc.erza.petalsaroundtheroses;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Game extends Activity {
	
	private Integer theAnswer = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	}

	private int throwDice() {
		int randInt = (int)(Math.random() * 6 + 1);
		return randInt;
	}

	public void showThrow(View view) {
		
		EditText answerField = (EditText) findViewById(R.id.editText1);
		Drawable beige = getResources().getDrawable(R.drawable.beige);
		answerField.setBackground(beige);
		answerField.setPaddingRelative(10, 10, 10, 10);
		
		ImageView dice1 = (ImageView) findViewById(R.id.dice1);
		ImageView dice2 = (ImageView) findViewById(R.id.dice2);
		ImageView dice3 = (ImageView) findViewById(R.id.dice3);
		ImageView dice4 = (ImageView) findViewById(R.id.dice4);
		ImageView dice5 = (ImageView) findViewById(R.id.dice5);
		ImageView dice6 = (ImageView) findViewById(R.id.dice6);
		
		ImageView diceQ[] = {dice1, dice2, dice3, dice4, dice5, dice6};
		
		theAnswer = 0;
		
		
		for(ImageView dice : diceQ) {
			
			int i = this.throwDice();
			
			switch(i) {
				case 1:
						dice.setImageResource(R.drawable.one);
						break;
						
				case 2:
						dice.setImageResource(R.drawable.two);
						break;
						
				case 3:
						dice.setImageResource(R.drawable.three);
						theAnswer += 2;
						break;
						
				case 4:
						dice.setImageResource(R.drawable.four);
						break;
					
				case 5:
						dice.setImageResource(R.drawable.five);
						theAnswer += 4;
						break;
					
				case 6:
						dice.setImageResource(R.drawable.six);
						break;
			}
		}
		
		Button diceThrower = (Button) findViewById(R.id.button1);
		diceThrower.setClickable(false);
		
		Button answerer = (Button) findViewById(R.id.button2);
		answerer.setClickable(true);
		
	}
	
	public void showAnswer (View view) {
		
		EditText answerField = (EditText) findViewById(R.id.editText1);
		String textAnswer = answerField.getText().toString();
		
		if (textAnswer.equals(theAnswer.toString())) {
			Drawable green = getResources().getDrawable(R.drawable.green);
			answerField.setBackground(green);
			answerField.setPaddingRelative(10, 10, 10, 10);
		}
		else {
			answerField.setText(theAnswer.toString());
			Drawable red = getResources().getDrawable(R.drawable.red);
			answerField.setBackground(red);
			answerField.setPaddingRelative(10, 10, 10, 10);
		}
		
		Button diceThrower = (Button) findViewById(R.id.button1);
		diceThrower.setClickable(true);
		
		Button answerer = (Button) findViewById(R.id.button2);
		answerer.setClickable(false);
		
	}
}
