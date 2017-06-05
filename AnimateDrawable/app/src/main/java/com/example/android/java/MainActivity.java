package com.example.android.java;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private AnimationDrawable mokeyAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.animation);
        if (imageView == null) throw new AssertionError();
        imageView.setVisibility(View.INVISIBLE);
        imageView.setBackgroundResource(R.drawable.monkey_animation);
        mokeyAnimation = (AnimationDrawable) imageView.getBackground();
        mokeyAnimation.setOneShot(true);
    }

    public void onStartBtnClick(View v) {
        imageView.setVisibility(View.VISIBLE);
        if (mokeyAnimation.isRunning()) {
            mokeyAnimation.stop();
        }
        mokeyAnimation.start();
    }

    public void onStopBtnClick(View v) {
        mokeyAnimation.stop();
    }

}