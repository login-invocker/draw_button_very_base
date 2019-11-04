package com.example.draw_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout btnll;
LinearLayout.LayoutParams layoutParams=new LinearLayout.LayoutParams(
        LinearLayout.LayoutParams.MATCH_PARENT,
        LinearLayout.LayoutParams.WRAP_CONTENT);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnll=findViewById(R.id.btnll);// connect to layout
      final Button btn =new Button(MainActivity.this);// new button
      btn.setText("here button");
      btn.setLayoutParams(layoutParams);//add orientation
      btnll.addView(btn);// create view in layout
    }
}
