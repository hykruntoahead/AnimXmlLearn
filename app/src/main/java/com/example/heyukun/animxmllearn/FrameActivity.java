package com.example.heyukun.animxmllearn;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/6/1.
 */
public class FrameActivity extends AppCompatActivity {
    private AnimationDrawable mAnimationDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
        ImageView mImageView = (ImageView) findViewById(R.id.anim_frame);
        //获取AnimationDrawable实例
        mAnimationDrawable= (AnimationDrawable) mImageView.getBackground();
        //点击开始按钮
        findViewById(R.id.btn_rotate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mAnimationDrawable != null) {
                    Toast.makeText(getApplicationContext(),
                            R.string.start, Toast.LENGTH_SHORT).show();
                    mAnimationDrawable.start(); 
                }
            }
        });
        //点击停止按钮
        findViewById(R.id.btn_stop).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mAnimationDrawable != null) {
                    Toast.makeText(getApplicationContext(),
                            R.string.stop, Toast.LENGTH_SHORT).show();
                    mAnimationDrawable.stop();
                }
            }
        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mAnimationDrawable != null) {
            mAnimationDrawable.setCallback(null);
            mAnimationDrawable = null;
        }
    }
}