package com.example.heyukun.animxmllearn;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by heyukun on 2017/6/7.
 */

public class PropertyUse2Activity extends AppCompatActivity implements View.OnClickListener{
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
        switch (v.getId()){
            case R.id.btn_obj_1:
                ObjectAnimator.ofInt(mImageView,"imageResource",R.mipmap.beautiful).setDuration(1000).start();
                break;
            case R.id.btn_obj_2:
                ObjectAnimator.ofInt(mImageView,"maxWidth",400).setDuration(1000).start();
                break;
            case R.id.btn_obj_3:
                ObjectAnimator.ofInt(mImageView,"imageResource",R.mipmap.beautiful).setDuration(1000).start();
                break;
        }
    }
}
