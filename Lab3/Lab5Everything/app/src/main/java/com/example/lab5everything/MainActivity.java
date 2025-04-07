package com.example.lab5everything;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    String item[];
    DatePickerDialog datePickerDialog;
    DatePicker dp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        item = new String[]{"abc","xyz","Pick me"};
        ArrayAdapter<String> abc = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,item);

        abc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(abc);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String hey = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(),hey,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }}


        );
        dp =findViewById(R.id.Datetime);
        dp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"selected: "+ dp.getDayOfMonth()+"/"+(dp.getMonth()+1)+"/"+dp.getYear(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}