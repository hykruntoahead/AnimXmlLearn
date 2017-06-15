package com.example.heyukun.animxmllearn;


import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;

/**
 * Created by heyukun on 2017/6/14.
 */

public class PropertyInterpolatorActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView mImg;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro_inter);
        mImg = (ImageView) findViewById(R.id.iv_ball);
        findViewById(R.id.btn_acc).setOnClickListener(this);
        findViewById(R.id.btn_acc_dec).setOnClickListener(this);
        findViewById(R.id.btn_ant).setOnClickListener(this);
        findViewById(R.id.btn_ant_over).setOnClickListener(this);
        findViewById(R.id.btn_bou).setOnClickListener(this);
        findViewById(R.id.btn_cycle).setOnClickListener(this);
        findViewById(R.id.btn_dec).setOnClickListener(this);
        findViewById(R.id.btn_linear).setOnClickListener(this);
        findViewById(R.id.btn_overshoot).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_acc:
                ObjectAnimator objectAnimator = ObjectAnimator
                        .ofFloat(mImg,"translationY",0f,800f)
                        .setDuration(4000);
                //设置插值器为 AccelerateInterpolator
                objectAnimator.setInterpolator(new AccelerateInterpolator());
                objectAnimator.start();
                break;
            case R.id.btn_acc_dec:
                ObjectAnimator objectAnimator1 = ObjectAnimator
                        .ofFloat(mImg,"translationY",0f,800f)
                        .setDuration(4000);
                //设置插值器为 AccelerateInterpolator
                objectAnimator1.setInterpolator(new AccelerateDecelerateInterpolator());
                objectAnimator1.start();
                break;
            case R.id.btn_ant:
                ObjectAnimator objectAnimator2 = ObjectAnimator
                        .ofFloat(mImg,"translationY",0f,800f)
                        .setDuration(4000);
                //设置插值器为 AccelerateInterpolator
                objectAnimator2.setInterpolator(new AnticipateInterpolator());
                objectAnimator2.start();
                break;
            case R.id.btn_ant_over:
                ObjectAnimator objectAnimator3 = ObjectAnimator
                        .ofFloat(mImg,"translationY",0f,800f)
                        .setDuration(4000);
                //设置插值器为 AccelerateInterpolator
                objectAnimator3.setInterpolator(new AnticipateOvershootInterpolator());
                objectAnimator3.start();
                break;
            case R.id.btn_bou:
                ObjectAnimator objectAnimator4 = ObjectAnimator
                        .ofFloat(mImg,"translationY",0f,800f)
                        .setDuration(4000);
                //设置插值器为 AccelerateInterpolator
                objectAnimator4.setInterpolator(new BounceInterpolator());
                objectAnimator4.start();
                break;
            case R.id.btn_cycle:
                ObjectAnimator objectAnimator5 = ObjectAnimator
                        .ofFloat(mImg,"translationY",0f,800f)
                        .setDuration(4000);
                //设置插值器为 AccelerateInterpolator
                objectAnimator5.setInterpolator(new CycleInterpolator(2.0f));
                objectAnimator5.start();
                break;
            case R.id.btn_dec:
                ObjectAnimator objectAnimator6 = ObjectAnimator
                        .ofFloat(mImg,"translationY",0f,800f)
                        .setDuration(4000);
                //设置插值器为 AccelerateInterpolator
                objectAnimator6.setInterpolator(new DecelerateInterpolator());
                objectAnimator6.start();
                break;
            case R.id.btn_linear:
                ObjectAnimator objectAnimator7 = ObjectAnimator
                        .ofFloat(mImg,"translationY",0f,800f)
                        .setDuration(4000);
                //设置插值器为 AccelerateInterpolator
                objectAnimator7.setInterpolator(new LinearInterpolator());
                objectAnimator7.start();
                break;
            case R.id.btn_overshoot:
                ObjectAnimator objectAnimator8 = ObjectAnimator
                        .ofFloat(mImg,"translationY",0f,800f)
                        .setDuration(4000);
                //设置插值器为 AccelerateInterpolator
                objectAnimator8.setInterpolator(new OvershootInterpolator());
                objectAnimator8.start();
                break;

        }

    }
}
