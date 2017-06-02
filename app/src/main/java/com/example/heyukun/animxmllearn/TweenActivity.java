package com.example.heyukun.animxmllearn;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by heyukun on 2017/6/1.
 */

public class TweenActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView imageView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween);
        imageView = (ImageView) findViewById(R.id.imageView);

        findViewById(R.id.btn_alpha).setOnClickListener(this);
        findViewById(R.id.btn_scale).setOnClickListener(this);
        findViewById(R.id.btn_translate).setOnClickListener(this);
        findViewById(R.id.btn_rotate).setOnClickListener(this);
        findViewById(R.id.btn_set).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_alpha:
                Animation animation = AnimationUtils.loadAnimation(this,R.anim.view_alpha);
                imageView.startAnimation(animation);
                break;
            case R.id.btn_scale:
                Animation animation1 = AnimationUtils.loadAnimation(this,R.anim.view_scale);
                imageView.startAnimation(animation1);
                break;
            case R.id.btn_rotate:
                Animation animation2 = AnimationUtils.loadAnimation(this,R.anim.view_rotate);
                imageView.startAnimation(animation2);
                break;
            case R.id.btn_translate:
                Animation animation3 = AnimationUtils.loadAnimation(this,R.anim.view_translate);
                imageView.startAnimation(animation3);
                break;
            case R.id.btn_set:
                Animation animation4 = AnimationUtils.loadAnimation(this,R.anim.view_set);
                imageView.startAnimation(animation4);
                break;
            default:
                break;
        }
    }
}
