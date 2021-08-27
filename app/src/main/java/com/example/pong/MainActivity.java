package com.example.pong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView p1;
   ImageView p2 ;
   float x,y;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p1 = findViewById(R.id.playerOne);
        p2 = findViewById(R.id.playerTwo);
        View view = findViewById(R.id.activity);
        view.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                y = event.getY();


                if(event.getAction() == MotionEvent.ACTION_MOVE)
                 p1.setY(y);
                return true;
            }
        });


    }


}