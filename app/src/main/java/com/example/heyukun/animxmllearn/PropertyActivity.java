package com.example.heyukun.animxmllearn;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


/**
 * Created by heyukun on 2017/6/3.
 */

public class PropertyActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property);
        findViewById(R.id.btn_pro_1).setOnClickListener(this);
        findViewById(R.id.btn_pro_2).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case  R.id.btn_pro_1:
                startActivity(new Intent(this,PropertyUse1Activity.class));
                break;
            case R.id.btn_pro_2:
                startActivity(new Intent(this,PropertyUse2Activity.class));
                break;
        }
    }
}
