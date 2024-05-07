package com.shaihi.classexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstFragment firstFragment = FirstFragment.newInstance();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentView, firstFragment).commit();
    }
}