package com.example.lab1q2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class resultactivity extends AppCompatActivity {

    private TextView resultTextView;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultactivity); // ADD THIS LINE

        resultTextView = findViewById(R.id.resultText);
        backButton = findViewById(R.id.backButton);

        String result = getIntent().getStringExtra("calculation");
        resultTextView.setText(result);

        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(resultactivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
