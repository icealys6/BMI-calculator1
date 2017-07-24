package com.example.icealys.bmi_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void calcBMI(View v){
        //Get handles to controls
        EditText heightInputText = (EditText) findViewById(R.id.heightInputText);
        EditText weightInputText = (EditText) findViewById(R.id.weightInputText);
        TextView BMIoutput = (TextView) findViewById(R.id.BMIoutput);

       // Calc BMI;
        Editable height;
        Editable weight;
        height = heightInputText.getText();
        weight = weightInputText.getText();
        int x = Integer.parseInt(weight.toString());
        double y = Integer.parseInt(height.toString());
        x *=703;
        y *= y;
        double result = x/y;
        String weightStatus;
        String parseResult = String.valueOf(result);
        if(result < 18.5){
            weightStatus = "underweight";
        }
        else if(result >= 18.5 && result <= 24.9){
            weightStatus = "normal weight";
        }
        else if(result >= 25 && result <= 29.9){
            weightStatus = "overweight";
        }
        else{
            weightStatus = "obese";
        }
        parseResult = parseResult + ' ' + weightStatus;
        BMIoutput.setText(parseResult);
    }
}
