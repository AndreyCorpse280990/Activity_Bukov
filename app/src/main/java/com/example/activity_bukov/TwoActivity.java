package com.example.activity_bukov;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TwoActivity extends AppCompatActivity {

    private Button openBrowserButton, goBackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Log.d("Lifecycle", "onCreate TwoActivity");

        openBrowserButton = findViewById(R.id.openBrowserButton);
        goBackButton = findViewById(R.id.goBackButton);

        openBrowserButton.setOnClickListener(v -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com"));
            startActivity(browserIntent);
        });

        goBackButton.setOnClickListener(v -> finish());
    }

    @Override protected void onStart() { super.onStart(); Log.d("Lifecycle", "onStart TwoActivity"); }
    @Override protected void onResume() { super.onResume(); Log.d("Lifecycle", "onResume TwoActivity"); }
    @Override protected void onPause() { super.onPause(); Log.d("Lifecycle", "onPause TwoActivity"); }
    @Override protected void onStop() { super.onStop(); Log.d("Lifecycle", "onStop TwoActivity"); }
    @Override protected void onDestroy() { super.onDestroy(); Log.d("Lifecycle", "onDestroy TwoActivity"); }
}
