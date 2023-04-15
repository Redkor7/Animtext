package com.example.animtext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int i = 0;

    TextView tx1;
    Animation anim, animb;
    Button button, buttonvis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anim = AnimationUtils.loadAnimation(this,R.anim.txt_anim);
        animb = AnimationUtils.loadAnimation(this, R.anim.anim_button);
        tx1 = findViewById(R.id.textView);
        tx1.setText("Hello man!");
        button = findViewById(R.id.button);
        buttonvis = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tx1.setText("Hello bro!" + i);
                tx1.startAnimation(anim);
                button.setVisibility(View.INVISIBLE);
                button.startAnimation(animb);
                i++;
            }
        });
        buttonvis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button.setVisibility(View.VISIBLE);
                button.startAnimation(anim);
            }
        });
    }

}