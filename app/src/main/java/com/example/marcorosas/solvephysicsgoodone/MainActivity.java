package com.example.marcorosas.solvephysicsgoodone;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void oneClick(View v) {
        Intent intent = new Intent(MainActivity.this, OneActivity.class);
        startActivity(intent);
    }

    public void twoClick(View v) {
        Intent intent = new Intent(MainActivity.this, TwoActivity.class);
        startActivity(intent);
    }

    public void threeClick(View v) {
        Intent intent = new Intent(MainActivity.this, ThreeActivity.class);
        startActivity(intent);
    }
}