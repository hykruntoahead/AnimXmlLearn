package com.example.heyukun.animxmllearn;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by heyukun on 2017/6/13.
 */

public class PropertyValueActivity extends AppCompatActivity {
    private ValueAnimator valueAnimator;
    private TextView mTextView;
    int height = 0;
    int width = 0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value);
        mTextView = (TextView) findViewById(R.id.textView);

        width= mTextView.getLayoutParams().width;
        mTextView.post(new Runnable() {
            @Override
            public void run() {
                height = mTextView.getMeasuredHeight();
            }
        });

        valueAnimator = ValueAnimator.ofInt(width,400);
        valueAnimator.setDuration(2000);
        //监听动画过程
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                Log.i("height","height:"+height);
                mTextView.getLayoutParams().width = (int) animation.getAnimatedValue();
                mTextView.getLayoutParams().height =
                        (int) ((400-width) * animation.getAnimatedFraction()) + height;
                mTextView.requestLayout();
            }
        });


        findViewById(R.id.btn_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueAnimator.start();
            }
        });


    }


}
