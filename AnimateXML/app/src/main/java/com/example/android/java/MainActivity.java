package com.example.android.java;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.faceIcon);
    }

    public void onButtonClick(View v) {
//        Animation animation = AnimationUtils.loadAnimation(this, R.anim.grow);
//        animation.setAnimationListener(new Animation.AnimationListener() {
//            @Override
//            public void onAnimationStart(Animation animation) {
//
//            }
//
//            @Override
//            public void onAnimationEnd(Animation animation) {
//                imageView.setScaleX(2.0f);
//                imageView.setScaleY(2.0f);
//            }
//
//            @Override
//            public void onAnimationRepeat(Animation animation) {
//            }
//        });
//        imageView.startAnimation(animation);
        imageView.animate()
                .scaleX(2.0f)
                .scaleY(2.0f)
                .rotationX(180f)
                .rotationY(180f)
                .translationX(200f)         // move right 200 pixel
                .translationX(200f)         // move down 200 pixel
                .setDuration(2000);
    }

}