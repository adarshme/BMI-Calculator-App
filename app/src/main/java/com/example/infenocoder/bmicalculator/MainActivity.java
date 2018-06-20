package com.example.infenocoder.bmicalculator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText heightEditText;
    EditText weightEditText;
    TextView bmiTextView;
    TextView bmiCatTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateBMI(View v){
        heightEditText = findViewById(R.id.heightEditText);
        weightEditText = findViewById(R.id.weightEditText);
        bmiTextView = findViewById(R.id.bmiTextView);
        bmiCatTextView = findViewById(R.id.bmiCatTextView);

        float height = (Float.valueOf(heightEditText.getText().toString()))/100;
        float weight = Float.valueOf(weightEditText.getText().toString());

        float bmi = weight/(height*height);

        if (bmi > 0 && bmi <= 15){
            bmiCatTextView.setText(getString(R.string.VSevUW));
            bmiCatTextView.setTextColor(Color.parseColor("#b71c1c"));
        }

        else if (bmi > 15 && bmi <= 16){
            bmiCatTextView.setText(getString(R.string.SevUW));
            bmiCatTextView.setTextColor(Color.parseColor("#c62828"));
        }

        else if (bmi > 16 && bmi <= 18.5){
            bmiCatTextView.setText(getString(R.string.UW));
            bmiCatTextView.setTextColor(Color.parseColor("#d32f2f"));
        }

        else if (bmi > 18.5 && bmi <= 25){
            bmiCatTextView.setText(getString(R.string.NW));
            bmiCatTextView.setTextColor(Color.parseColor("#1b5e20"));
        }

        else if (bmi > 25 && bmi <= 30){
            bmiCatTextView.setText(getString(R.string.OW));
            bmiCatTextView.setTextColor(Color.parseColor("#d32f2f"));
        }

        else if (bmi > 30 && bmi <= 35){
            bmiCatTextView.setText(getString(R.string.ModOW));
            bmiCatTextView.setTextColor(Color.parseColor("#c62828"));
        }

        else if (bmi > 35 && bmi <= 40){
            bmiCatTextView.setText(getString(R.string.SevOW));
            bmiCatTextView.setTextColor(Color.parseColor("#b71c1c"));
        }

        else if (bmi > 40){
            bmiCatTextView.setText(getString(R.string.VSevOW));
            bmiCatTextView.setTextColor(Color.parseColor("#d50000"));
        }

        bmiTextView.setText(String.valueOf(bmi));

    }
}
