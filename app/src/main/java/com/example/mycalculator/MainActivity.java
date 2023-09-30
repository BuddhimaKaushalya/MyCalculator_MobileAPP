package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Add(View view){
        EditText et1 = (EditText)findViewById(R.id.editTextNumber1);
        EditText et2 = (EditText)findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText)findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());

        int result = n1+n2;
        et3.setText("Total value = "+result);

    }

    public void Subtract(View view){
        EditText et1 = (EditText)findViewById(R.id.editTextNumber1);
        EditText et2 = (EditText)findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText)findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());

        int result = n1-n2;
        et3.setText("Subtract value = "+result);

    }

    public void Multiply(View view){
        EditText et1 = (EditText)findViewById(R.id.editTextNumber1);
        EditText et2 = (EditText)findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText)findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());

        int result = n1*n2;
        et3.setText("Multiply value = "+result);

    }
    public void Divide(View view){
        EditText et1 = (EditText)findViewById(R.id.editTextNumber1);
        EditText et2 = (EditText)findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText)findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());

        int result = n1/n2;
        et3.setText("Divide value = "+result);

    }

}