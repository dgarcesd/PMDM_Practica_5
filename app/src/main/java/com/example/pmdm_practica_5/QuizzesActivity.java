package com.example.pmdm_practica_5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pmdm_practica_5.model.Pregunta;
import com.example.pmdm_practica_5.databinding.ActivityQuizzesBinding;

import java.util.ArrayList;

public class QuizzesActivity extends Activity {
    private ActivityQuizzesBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityQuizzesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        pregunta1(1,"","","");










    }



    private void abrirDetailActivity(Integer numPregunta, String respuesta1, String respuesta2, String respuesta3) {


        Pregunta pregunta = new Pregunta(numPregunta,respuesta1,respuesta2,respuesta3);

        Intent irADetalle = new Intent(this,DetailActivityQuizzes.class);

        irADetalle.putExtra("pregunta", String.valueOf(pregunta));

        startActivity(irADetalle);

    }

    private void pregunta1(Integer numPregunta, String respuesta1, String respuesta2, String respuesta3){
        binding.numPregunta.setText("1/3", TextView.BufferType.EDITABLE);
        binding.Pregunta.setText("¿Quien es el campeon mas joven de la historia?",TextView.BufferType.EDITABLE);
        binding.respuesta1.setText("Max Verstappen",TextView.BufferType.EDITABLE);
        binding.respuesta2.setText("Sebastian Vettel",TextView.BufferType.EDITABLE);
        binding.respuesta3.setText("Lewis Hamilton",TextView.BufferType.EDITABLE);

        binding.enviar.setOnClickListener(v -> {
            if(!binding.respuesta1.isChecked() && !binding.respuesta2.isChecked() && !binding.respuesta3.isChecked()){
                Toast.makeText(this, "No se selecciono ninguna respuesta", Toast.LENGTH_SHORT).show();
            } else if (binding.respuesta2.isSelected()){
                abrirDetailActivity(numPregunta,respuesta1,respuesta2,respuesta3);

            } else {
                abrirDetailActivity(numPregunta,respuesta1,respuesta2,respuesta3);

            }
        });


    }

    public void pregunta2(Integer numPregunta, String respuesta1, String respuesta2, String respuesta3){
        binding.numPregunta.setText("2/3",TextView.BufferType.EDITABLE);
        binding.Pregunta.setText("¿Quien gano mas carreras en el campeonato de 2021?",TextView.BufferType.EDITABLE);
        binding.respuesta1.setText("Max Verstappen",TextView.BufferType.EDITABLE);
        binding.respuesta2.setText("Sergio Perez",TextView.BufferType.EDITABLE);
        binding.respuesta3.setText("Lewis Hamilton",TextView.BufferType.EDITABLE);

        binding.enviar.setOnClickListener(v -> {
            if(!binding.respuesta1.isSelected() || !binding.respuesta2.isSelected() || !binding.respuesta3.isSelected()){
                Toast.makeText(this, "No se selecciono ninguna respuesta", Toast.LENGTH_SHORT).show();
            } else if (binding.respuesta1.isSelected()){
                abrirDetailActivity(numPregunta,respuesta1,respuesta2,respuesta3);
                DetailActivityQuizzes.res1();
            } else {
                abrirDetailActivity(numPregunta,respuesta1,respuesta2,respuesta3);
                DetailActivityQuizzes.res2();
            }
        });




    }

    private void pregunta3(Integer numPregunta, String respuesta1, String respuesta2, String respuesta3){
        binding.numPregunta.setText("3/3",TextView.BufferType.EDITABLE);
        binding.Pregunta.setText("¿Que equipo gano el mundial de constructores en el año 2021?",TextView.BufferType.EDITABLE);
        binding.respuesta1.setText("Ferrari",TextView.BufferType.EDITABLE);
        binding.respuesta2.setText("Mercedes",TextView.BufferType.EDITABLE);
        binding.respuesta3.setText("Red Bull",TextView.BufferType.EDITABLE);

        binding.enviar.setOnClickListener(v -> {
            if(!binding.respuesta1.isSelected() || !binding.respuesta2.isSelected() || !binding.respuesta3.isSelected()){
                Toast.makeText(this, "No se selecciono ninguna respuesta", Toast.LENGTH_SHORT).show();
            } else if (binding.respuesta2.isSelected()){
                abrirDetailActivity(numPregunta,respuesta1,respuesta2,respuesta3);
                DetailActivityQuizzes.res1();
            } else {
                abrirDetailActivity(numPregunta,respuesta1,respuesta2,respuesta3);
                DetailActivityQuizzes.res2();
            }
        });


    }

}