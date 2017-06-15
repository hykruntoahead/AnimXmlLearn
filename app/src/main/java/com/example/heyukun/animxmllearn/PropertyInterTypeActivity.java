package com.example.heyukun.animxmllearn;

import android.animation.ArgbEvaluator;
import android.animation.IntEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

/**
 * Created by heyukun on 2017/6/13.
 */

public class PropertyInterTypeActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView mImg;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inter_type);
        mImg = (ImageView) findViewById(R.id.iv);

        findViewById(R.id.btn_translate_linear).setOnClickListener(this);
        findViewById(R.id.btn_translate_acc).setOnClickListener(this);
        findViewById(R.id.btn_color_int).setOnClickListener(this);
        findViewById(R.id.btn_color_argb).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            //线性平移
            case R.id.btn_translate_linear:
                ObjectAnimator objectAnimator =ObjectAnimator
                           .ofFloat(mImg,"translationY",0f,420f)
                           .setDuration(4000);
                //设置插值器为 LinearInterpolator
                objectAnimator.setInterpolator(new LinearInterpolator());
                objectAnimator.start();
                break;
            //加速平移
            case R.id.btn_translate_acc:
                ObjectAnimator objectAnimator1 = ObjectAnimator
                        .ofFloat(mImg,"translationY",0f,420f)
                        .setDuration(4000);
                //设置插值器为 AccelerateInterpolator
                objectAnimator1.setInterpolator(new AccelerateInterpolator());
                objectAnimator1.start();
                break;
            //背景色1
            case R.id.btn_color_int:
                ObjectAnimator objectAnimator2 = ObjectAnimator
                        .ofInt(mImg,"backgroundColor",0x00000000,0xff99cc00)
                        .setDuration(3000);
                //设置估值器IntEvaluator
                objectAnimator2.setEvaluator(new IntEvaluator());
                objectAnimator2.start();
                break;
            //背景色2
            case R.id.btn_color_argb:
                ObjectAnimator objectAnimator3 = ObjectAnimator
                        .ofInt(mImg,"backgroundColor",0x00000000,0xff99cc00)
                        .setDuration(3000);
                //设置估值器 ArgbEvaluator
                objectAnimator3.setEvaluator(new ArgbEvaluator());
                objectAnimator3.start();
                break;
        }
    }
}
