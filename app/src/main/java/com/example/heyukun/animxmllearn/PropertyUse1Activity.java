package com.example.heyukun.animxmllearn;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by heyukun on 2017/6/5.
 */

public class PropertyUse1Activity extends AppCompatActivity {
    private ImageView mImageView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_use1);
        mImageView = (ImageView) findViewById(R.id.img_beauty);

        findViewById(R.id.btn_obj).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                ObjectAnimator
                        .ofArgb(mImageView,"imageResource",R.mipmap.anime_beauty_1)
                        .setDuration(3000)
                        .start();
            }
        });

        findViewById(R.id.btn_value).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueAnimator valueAnimator = ValueAnimator.ofInt(0x000000000
                        ,0xffffbb33,0xff99cc00);
                valueAnimator.setEvaluator(new ArgbEvaluator());
                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator animation) {
                        mImageView.setBackgroundColor((int) animation.getAnimatedValue());
                    }
                });
                valueAnimator.setDuration(5000);
                valueAnimator.start();

            }
        });

        findViewById(R.id.btn_set).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimatorSet animationSet = new AnimatorSet();
                animationSet
                        .play(ObjectAnimator.ofFloat(mImageView,"alpha",1f,0.2f,1f))
                        .with(ObjectAnimator.ofFloat(mImageView,"scaleX",1f,0.2f,1f))
                        .with(ObjectAnimator.ofFloat(mImageView,"scaleY",1f,0.2f,1f))
                        .with(ObjectAnimator.ofFloat(mImageView,"rotation",0f,360f));
                animationSet.setDuration(3600).start();
            }
        });
    }
}
