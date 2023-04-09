package com.example.peliculas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.peliculas.databinding.ActivityMainBinding;
import com.example.peliculas.modelo.Pelicula;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private MainActivityViewModel viewModel;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainActivityViewModel.class);

        viewModel.getListaDePeliculasLiveData().observe(this, listaDePeliculas -> {
            GridLayoutManager grilla = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
            binding.rvListaPelis.setLayoutManager(grilla);
            PeliculaAdapter adapter = new PeliculaAdapter(this, listaDePeliculas, getLayoutInflater());
            binding.rvListaPelis.setAdapter(adapter);
        });
    }
}