package com.example.peliculas;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.peliculas.modelo.Pelicula;

public class DescriptionActivityViewModel extends AndroidViewModel {

    private MutableLiveData<Pelicula> pelicula = new MutableLiveData<>();

    public DescriptionActivityViewModel(@NonNull Application application) { super(application); }

    public LiveData<Pelicula> getPelicula() {
        if (pelicula == null) {
            pelicula = new MutableLiveData<>();
        }
        return pelicula;
    }

    public void procesarDatos(Intent intent){
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            pelicula.setValue((Pelicula) bundle.getSerializable("pelicula"));
        }
    }
}
