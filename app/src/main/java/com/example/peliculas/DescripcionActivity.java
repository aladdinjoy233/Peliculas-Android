package com.example.peliculas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.peliculas.databinding.ActivityDescripcionBinding;
import com.example.peliculas.modelo.Pelicula;

public class DescripcionActivity extends AppCompatActivity {

    ActivityDescripcionBinding binding;
    DescriptionActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDescripcionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = new ViewModelProvider(this).get(DescriptionActivityViewModel.class);

        viewModel.procesarDatos(getIntent());

        viewModel.getPelicula().observe(this, pelicula -> {
            binding.tvTituloPeli.setText(pelicula.getTitulo());
            binding.tvDirector.setText(pelicula.getDirector());
            binding.tvActores.setText(pelicula.getActores());
            binding.tvResenia.setText(pelicula.getResenia());
            binding.ivFotoPeli.setImageResource(pelicula.getImagenResId());
        });
    }
}