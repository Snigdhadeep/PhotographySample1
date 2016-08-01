package com.example.snikdha.photography_sample1;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
ImageView rotateImage;
        rotateImage = (ImageView) findViewById(R.id.cameraicon);
        Animation startRotateAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotation);
        rotateImage.startAnimation(startRotateAnimation);

        getIntent();


    }




}
