package com.example.pmdm_practica_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.pmdm_practica_5.model.Pregunta;
import com.example.pmdm_practica_5.databinding.ActivityDetailQuizzesBinding;

public class DetailActivityQuizzes extends AppCompatActivity {
    private static ActivityDetailQuizzesBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailQuizzesBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        Bundle extras = getIntent().getExtras();

        Pregunta pregunta = extras.getParcelable("pregunta");



    }

    private void cerrarDetailActivity(Integer numPregunta, String respuesta1, String respuesta2, String respuesta3) {


        Pregunta pregunta = new Pregunta(numPregunta,respuesta1,respuesta2,respuesta3);

        Intent cerrarDetalle = new Intent(this, QuizzesActivity.class);

        cerrarDetalle.putExtra("pregunta", String.valueOf(pregunta));

        startActivity(cerrarDetalle);

    }

    public static void res1(){
        binding.Solucion.setText("Respuesta Correcta", TextView.BufferType.EDITABLE);
    }
    public static void res2(){
        binding.Solucion.setText("Respuesta Incorrecta", TextView.BufferType.EDITABLE);
    }
    public static void volver(){
binding.Siguiente.
    }
}