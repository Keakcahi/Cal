package com.keakchai.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText EdT_No1;
    private EditText EdT_No2;
    private Button PlusB;
    private Button minusB;
    private Button multiB;
    private Button divideB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EdT_No1 = findViewById(R.id.EdT_No1);
        EdT_No2 = findViewById(R.id.EdT_No2);
        PlusB =findViewById(R.id.PlusB);
        minusB =findViewById(R.id.minusB);
        multiB =findViewById(R.id.multiB);
        divideB =findViewById(R.id.divideB);

        PlusB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Num1 = Integer.parseInt(EdT_No1.getText().toString());
                int Num2 = Integer.parseInt(EdT_No2.getText().toString());
                Toast.makeText( MainActivity.this,String.valueOf(plus(Num1,Num2)),Toast.LENGTH_SHORT).show();
                plus(Num1,Num2);

            }
        });

        minusB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Num1 = Integer.parseInt(EdT_No1.getText().toString());
                int Num2 = Integer.parseInt(EdT_No2.getText().toString());
                minus(Num1,Num2);

            }
        });

        multiB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Num1 = Integer.parseInt(EdT_No1.getText().toString());
                int Num2 = Integer.parseInt(EdT_No2.getText().toString());
                multiply(Num1,Num2);

            }
        });

        divideB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Num1 = Integer.parseInt(EdT_No1.getText().toString());
                int Num2 = Integer.parseInt(EdT_No2.getText().toString());
                divide(Num1,Num2);

            }
        });

    }

    private int plus(int Num1, int Num2){
        return Num1 + Num2;
    }

    private int minus(int Num1, int Num2){
        return Num1 + Num2;
    }

    private int multiply(int Num1, int Num2){
        return Num1 + Num2;
    }

    private int divide(int Num1, int Num2){
        if (Num2 == 0){
            return 0;
        }else {
            return Num1 + Num2;
        }
    }
}
