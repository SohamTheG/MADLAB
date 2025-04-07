package com.example.lab1q2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText num1EditText, num2EditText;
    private Button addButton, subtractButton, multiplyButton, divideButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1EditText = findViewById(R.id.num1);
        num2EditText = findViewById(R.id.num2);
        addButton = findViewById(R.id.add);
        subtractButton = findViewById(R.id.subtract);
        multiplyButton = findViewById(R.id.multiply);
        divideButton = findViewById(R.id.divide);

        addButton.setOnClickListener(v -> calculateAndSendResult('+'));
        subtractButton.setOnClickListener(v -> calculateAndSendResult('-'));
        multiplyButton.setOnClickListener(v -> calculateAndSendResult('*'));
        divideButton.setOnClickListener(v -> calculateAndSendResult('/'));
    }

    private void calculateAndSendResult(char operator) {
        String num1Str = num1EditText.getText().toString();
        String num2Str = num2EditText.getText().toString();

        if (num1Str.isEmpty() || num2Str.isEmpty()) {
            num1EditText.setError("Enter number");
            num2EditText.setError("Enter number");
            return;
        }

        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);
        double result = 0;

        switch (operator) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/':
                if (num2 == 0) {
                    num2EditText.setError("Cannot divide by zero");
                    return;
                }
                result = num1 / num2;
                break;
        }

        String resultString = num1 + " " + operator + " " + num2 + " = " + result;

        Intent intent = new Intent(MainActivity.this, resultactivity.class);
        intent.putExtra("calculation", resultString);
        startActivity(intent);
    }
}
