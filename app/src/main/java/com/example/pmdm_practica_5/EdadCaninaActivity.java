package com.example.pmdm_practica_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pmdm_practica_5.databinding.ActivityEdadCaninaBinding;

public class EdadCaninaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityEdadCaninaBinding binding = ActivityEdadCaninaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        EditText ageEdit = binding.EdadEditText;

        binding.btnCalcular.setOnClickListener(v -> {

            String edad = ageEdit.getText().toString();
            if (!edad.isEmpty()) {
                int edadInteger = Integer.parseInt(edad);

                int resultado = edadInteger * 7;

                String resultadoTexto = getString(R.string.result_format, resultado);

                binding.RespuestaTextView.setText(resultadoTexto);
            } else {
                Log.d("MainActivity", "El campo Edad está vacio");
                Toast.makeText(this, getString(R.string.you_have_to_insert_an_age), Toast.LENGTH_LONG).show();
            }

        });
    }
}