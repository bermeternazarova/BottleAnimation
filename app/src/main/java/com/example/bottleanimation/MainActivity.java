package com.example.bottleanimation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView bottle;
    Random random;
    int poseOfbottle;
    int overed;
    ConstraintLayout background;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottle= findViewById(R.id.bottle);
        background=findViewById(R.id.background);
        random=new Random();
        overed=5;  //оборот бутылки
    }
    public void bottleMove(View view){

        int sum = random.nextInt(2000);
        float s=bottle.getWidth()/2;
        float d = bottle.getHeight()/2;

        Animation rotate = new RotateAnimation(poseOfbottle, sum+overed+ 2000,s,d);
        rotate.setDuration(5000);
         rotate.setFillAfter(true);
        bottle.startAnimation(rotate);
        poseOfbottle=sum;

    }
    public void chooseBackground01(View view){
        background.setBackgroundResource(R.drawable.bacgi01);

    }
    public void chooseBackground02(View view){
        background.setBackgroundResource(R.drawable.backgi02);
    }

    public void chooseBackground05(View view){
        background.setBackgroundResource(R.drawable.backgi05);
    }
}