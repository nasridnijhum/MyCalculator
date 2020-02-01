package com.nijhum.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtResult;
    EditText etNumber1,etNumber2;
    Button btnplus,btnminus,btnmulti,btndiv,btnreset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult=findViewById(R.id.txt_result);
        etNumber1=findViewById(R.id.et_number1);
        etNumber2=findViewById(R.id.et_number2);
        btnplus=findViewById(R.id.btn_plus);
        btnminus=findViewById(R.id.btn_minus);
        btnmulti=findViewById(R.id.btn_multi);
        btndiv=findViewById(R.id.btn_div);
        btnreset=findViewById(R.id.btn_reset);

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=etNumber1.getText().toString();
                String number2=etNumber2.getText().toString();

                if (number1.isEmpty() || number2.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "No chalaki.Pls input the number", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double value1=Double.parseDouble(number1);
                    double value2=Double.parseDouble(number2);

                    double result=value1+value2;

                    txtResult.setText(""+result);
                }
            }
        });

        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=etNumber1.getText().toString();
                String number2=etNumber2.getText().toString();

                if (number1.isEmpty() || number2.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "No chalaki.Pls input the number", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double value1=Double.parseDouble(number1);
                    double value2=Double.parseDouble(number2);

                    double result=value1-value2;

                    txtResult.setText(""+result);
                }
            }
        });

        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=etNumber1.getText().toString();
                String number2=etNumber2.getText().toString();

                if (number1.isEmpty() || number2.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "No chalaki.Pls input the number", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double value1=Double.parseDouble(number1);
                    double value2=Double.parseDouble(number2);

                    double result=value1*value2;

                    txtResult.setText(""+result);
                }
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=etNumber1.getText().toString();
                String number2=etNumber2.getText().toString();

                if (number1.isEmpty() || number2.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "No chalaki.Pls input the number", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double value1=Double.parseDouble(number1);
                    double value2=Double.parseDouble(number2);

                    double result=value1/value2;

                    txtResult.setText(""+result);
                }
            }
        });

        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText("0");
                etNumber1.setText("");
                etNumber2.setText("");
            }
        });


//this is updatednnnnn
    }
}
