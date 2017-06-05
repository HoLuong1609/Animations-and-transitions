package com.example.android.java;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.faceIcon);
    }

    public void onButtonClick(View v) {
        ObjectAnimator objectAnimatorX = ObjectAnimator.ofFloat(imageView, "scaleX", 1f, 2f)
                .setDuration(1000);
//        objectAnimatorX.start();
        ObjectAnimator objectAnimatorY = ObjectAnimator.ofFloat(imageView, "scaleY", 1f, 2f)
                .setDuration(1000);
//        objectAnimatorY.start();
        AnimatorSet set = new AnimatorSet();
//        set.playTogether(objectAnimatorX, objectAnimatorY);
        set.playSequentially(objectAnimatorX, objectAnimatorY);
        set.setDuration(3000);
        set.start();
    }

}