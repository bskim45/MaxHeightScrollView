package com.bskim.maxheightscrollview.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bskim.maxheightscrollview.widgets.MaxHeightScrollView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaxHeightScrollView sv = (MaxHeightScrollView) findViewById(R.id.programmaticScrollView);
        sv.setMaxHeightDp(60);
    }
}
