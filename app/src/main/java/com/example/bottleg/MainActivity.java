package com.example.bottleg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    int nextnum;
    int cuttentnum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageView);
        spinBottle();
    }

    private void spinBottle() {
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextnum=new Random().nextInt(5000);

                float px=imageView.getWidth()/2;
                float py=imageView.getHeight()/2;
                Animation rotate=new RotateAnimation(0,nextnum,px,py);
                rotate.setDuration(4000);
                rotate.setFillAfter(true);
                cuttentnum=nextnum;
                imageView.startAnimation(rotate);
            }
        });


    }
}