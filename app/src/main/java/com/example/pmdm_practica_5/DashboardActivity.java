package com.example.pmdm_practica_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import com.example.pmdm_practica_5.databinding.ActivityDashboardBinding;

public class DashboardActivity extends AppCompatActivity {
    ActivityDashboardBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDashboardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupMenuButtons();
    }

    private void setupMenuButtons() {
        binding.rellayCalculadora.setOnClickListener(v -> {
            Intent intent = new Intent(this, CalculadoraActivity.class);
            startActivity(intent);
        });
        binding.rellayMusica.setOnClickListener(v -> {
            Intent intent = new Intent(this, MusicaActivity.class);
            startActivity(intent);
        });
        binding.rellayPerrete.setOnClickListener(v -> {
            Intent intent = new Intent(this, EdadCaninaActivity.class);
            startActivity(intent);
        });
        binding.rellayQuizzes.setOnClickListener(v -> {
            Intent intent = new Intent(this, QuizzesActivity.class);
            startActivity(intent);
        });

    }
}