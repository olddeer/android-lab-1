package com.example.lab1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText decimalView;
    private EditText binaryView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        decimalView = (EditText) (findViewById(R.id.editTextDecimal));
        binaryView = (EditText) (findViewById(R.id.editTextBinary));
    }

    public void reset(View view) {
        decimalView.getText().clear();
        binaryView.getText().clear();
    }

    public void onConvertDecimalToBinary(View view) {
        binaryView.getText().clear();
        binaryView.getText().append(convertDecimalToBinary(
                Integer.parseInt(decimalView.getText().toString())));
    }

    private String convertDecimalToBinary(int decimal) {
        StringBuilder sb = new StringBuilder();
        while (decimal > 0) {
            sb.append(decimal % 2);
            decimal = decimal/2;
        }
        return sb.reverse().toString();
    }
}
