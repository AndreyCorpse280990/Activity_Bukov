package com.example.activity_bukov;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button openTwoActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Lifecycle", "onCreate MainActivity");

        openTwoActivityButton = findViewById(R.id.openTwoActivityButton);
        openTwoActivityButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TwoActivity.class);
            startActivity(intent);
        });
    }

    @Override protected void onStart() { super.onStart(); Log.d("Lifecycle", "onStart MainActivity"); }
    @Override protected void onResume() { super.onResume(); Log.d("Lifecycle", "onResume MainActivity"); }
    @Override protected void onPause() { super.onPause(); Log.d("Lifecycle", "onPause MainActivity"); }
    @Override protected void onStop() { super.onStop(); Log.d("Lifecycle", "onStop MainActivity"); }
    @Override protected void onDestroy() { super.onDestroy(); Log.d("Lifecycle", "onDestroy MainActivity"); }
}
