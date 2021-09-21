package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickRelativeLayout(View v)
    {
        Intent NextActivity = new Intent(MainActivity.this, RelativeActivity.class);
        startActivity(NextActivity);
    }

    public void clickTableLayouts(View v)
    {
        Intent NextActivity = new Intent(MainActivity.this, TableActivity.class);
        startActivity(NextActivity);
    }

    public void clickScrollLayouts(View v)
    {
        Intent NextActivity = new Intent(MainActivity.this, ScrollActivity.class);
        startActivity(NextActivity);
    }

    public void clickFrameLayouts(View c)
    {
        Intent NextActivity = new Intent(MainActivity.this, FrameActivity.class);
        startActivity(NextActivity);
    }

    public void clickClose(View v)
    {
        finish();
        System.exit(0);
    }
}