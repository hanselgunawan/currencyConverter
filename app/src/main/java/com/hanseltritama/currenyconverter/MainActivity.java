package com.hanseltritama.currenyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    public void onConvertClicked(View view){

        double idr = 0;
        String outputText = "";
        EditText numEditText = findViewById(R.id.numEditText);
        idr = Double.parseDouble(numEditText.getText().toString())*15000;
        outputText = NumberFormat.getIntegerInstance().format(idr);
        Toast.makeText(this, "$" + numEditText.getText().toString()+" = Rp " + outputText, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
