package com.example.android.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        Log.i("MainActivity.java", "Mango Sorbet");

        Log.i("MainActivity.java", "Blueberry Pie");

        Log.i("MainActivity.java", "Chocolate Lava Cake");

    }
}
