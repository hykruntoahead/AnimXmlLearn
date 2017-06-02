package com.example.heyukun.animxmllearn;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Administrator on 2017/6/2.
 */

public class LayoutAnimActivity extends AppCompatActivity {
    private ListView mListView;
    String items[] = {
            "item-0", "item-1","item-2","item-3","item-4","item-5","item-6"
    };
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
        mListView = (ListView) findViewById(R.id.lv);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,items);
        mListView.setAdapter(adapter);

    }
}
