package com.example.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDD;
    Button btnDT;
    TextView tvDisplay;
    Button btnRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp=findViewById(R.id.datePicker);
        tp=findViewById(R.id.timePicker);
        btnDD=findViewById(R.id.buttonDisplayDate);
        btnDT=findViewById(R.id.buttonDisplayTime);
        tvDisplay=findViewById(R.id.textView);
        btnRes=findViewById(R.id.buttonReset);

        tp.setIs24HourView(true);

        btnDD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplay.setText("Date is "+dp.getDayOfMonth()+"/"+(dp.getMonth()+1)+"/"+dp.getYear());
            }
        });

        btnDT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplay.setText("Time is "+tp.getCurrentHour()+":"+tp.getCurrentMinute());
            }
        });

        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dp.updateDate(2020, 0, 1);
                tp.setCurrentHour(0);
                tp.setCurrentMinute(0);
                tvDisplay.setText("");
            }
        });

    }
}