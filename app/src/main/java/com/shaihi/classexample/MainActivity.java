package com.shaihi.classexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstFragment firstFragment = FirstFragment.newInstance();
        SecondFragment secondFragment = SecondFragment.newInstance();

        Bundle args = new Bundle();
        args.putString("TEST", "Frag1");
        firstFragment.setArguments(args);


        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentView, firstFragment)
                .commit();

        Button fragOneBtn = findViewById(R.id.fragOneBtn);
        Button fragTwoBtn = findViewById(R.id.fragTwoBtn);

        fragOneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragmentView, firstFragment)
                        .commit();
            }
        });

        fragTwoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentView, secondFragment)
                        .commit();
            }
        });

    }
}