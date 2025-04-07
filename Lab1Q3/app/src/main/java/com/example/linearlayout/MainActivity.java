package com.example.linearlayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button okButton = findViewById(R.id.button2);

        // Set the OnClickListener for the OK button
        okButton.setOnClickListener(v -> {
            // When the OK button is clicked, open the LinearLayout activity
            Intent intent = new Intent(MainActivity.this, LinearLayout.class);
            startActivity(intent);})
    ;}
}