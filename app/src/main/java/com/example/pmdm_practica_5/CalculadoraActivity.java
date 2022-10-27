package com.example.pmdm_practica_5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;



public class CalculadoraActivity extends AppCompatActivity {

    private Button Sumar;
    private Button Restar;
    private Button Multiplicar;
    private Button Dividir;

    private TextView Respuesta;

    private EditText num1;
    private EditText num2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        Respuesta = findViewById(R.id.text_resp);

        num1 = findViewById(R.id.Num_1);
        num2 = findViewById(R.id.Num_2);



        Sumar = findViewById(R.id.Sumar);
        Sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Respuesta.setText(suma(Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString()) )+"");
            }
        });

        Restar = findViewById(R.id.Restar);
        Restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Respuesta.setText(resta( Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString()) )+"");

            }
        });
        Multiplicar = findViewById(R.id.Multiplicar);
        Multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Respuesta.setText(multiplicacion( Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString()) )+"");

            }
        });
        Dividir = findViewById(R.id.Dividir);
        Dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Respuesta.setText(division( Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString()) )+"");

            }
        });


    }

    public double suma (int a, int b){
        return a+b;
    }

    public double resta (int a, int b){
        return a-b;
    }

    public double multiplicacion (int a, int b){
        return a*b;
    }

    public double division (int a, int b) {
        int respuesta = 0;

        if (b != 0) {
            respuesta = a / b;
        }

        return respuesta;

    }

}