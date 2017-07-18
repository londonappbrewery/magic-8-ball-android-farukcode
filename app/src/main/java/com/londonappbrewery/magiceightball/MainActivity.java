package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View.*;
import java.util.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		
		
		 
		 Button askButton = (Button) findViewById(R.id.askButton);
		 askButton.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				
			ImageView ballDisplay = (ImageView) findViewById(R.id.ballDisplay);
		
				int[] ballArray = {
					R.drawable.ball1,
					R.drawable.ball2,
					R.drawable.ball3,
					R.drawable.ball4,
					R.drawable.ball5
				};
				
				Random randomNumberGenerator = new Random();
				int number = randomNumberGenerator.nextInt(4);
				
				ballDisplay.setImageResource(ballArray[number]);
				
			}
		
			
		});
	}
    }
	
	
