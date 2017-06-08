package com.example.heyukun.animxmllearn;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by heyukun on 2017/6/7.
 */

public class PropertyUse2Activity extends AppCompatActivity implements View.OnClickListener {
    private ImageView mImageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_use2);
        mImageView = (ImageView) findViewById(R.id.imageView);
        findViewById(R.id.btn_obj_1).setOnClickListener(this);
        findViewById(R.id.btn_obj_2).setOnClickListener(this);
        findViewById(R.id.btn_obj_3).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_obj_1:
                ObjectAnimator
                        .ofInt(mImageView, "imageResource", R.mipmap.anime_1, R.mipmap.anime_2, R.mipmap.anime_3)
                        .setDuration(3000)
                        .start();
                break;
            case R.id.btn_obj_2:
                PropertyValuesHolder[] propertyValuesHolders = {
                        //渐变
                        PropertyValuesHolder.ofFloat("alpha", 1f, 0, 1f),
                        //缩放
                        PropertyValuesHolder.ofFloat("scaleX", 1f, 0, 1f),
                        PropertyValuesHolder.ofFloat("scaleY", 1f, 0, 1f),
                        //旋转 (+rotation)
                        PropertyValuesHolder.ofFloat("rotationX", 1f, 0, 1f),
                        PropertyValuesHolder.ofFloat("rotationY", 1f, 0, 1f),
                        //平移
                        PropertyValuesHolder.ofFloat("translationX",0,100f,0f),
                        PropertyValuesHolder.ofFloat("translationY",0,100f,0f)
                };

                ObjectAnimator.ofPropertyValuesHolder(mImageView, propertyValuesHolders)
                        .setDuration(3000).start();

                break;
            case R.id.btn_obj_3:
                ObjectAnimator.ofInt(mImageView, "imageResource", R.mipmap.beautiful).setDuration(1000).start();
                break;
        }
    }
}
