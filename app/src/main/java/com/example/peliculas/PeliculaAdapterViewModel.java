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

import java.util.ArrayList;

public class PeliculaAdapterViewModel extends AndroidViewModel {
    private Context context;

    public PeliculaAdapterViewModel(@NonNull Application application) {
        super(application);
        context = application.getApplicationContext();
    }

    public void abrirDetalle(Pelicula pelicula) {
        Intent intent = new Intent(context, DescripcionActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        Bundle bundle = new Bundle();
        bundle.putSerializable("pelicula", pelicula);

        intent.putExtras(bundle);
        context.startActivity(intent);
    }
}
