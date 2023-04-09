package com.example.peliculas;

import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.peliculas.databinding.ActivityMainBinding;
import com.example.peliculas.modelo.Pelicula;

import java.util.ArrayList;

public class MainActivityViewModel extends AndroidViewModel {

    private ArrayList<Pelicula> listaDePeliculas;
    private MutableLiveData<ArrayList<Pelicula>> listaDePeliculasLiveData;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        generarPeliculas();
    }

    public MutableLiveData<ArrayList<Pelicula>> getListaDePeliculasLiveData() {
        if (listaDePeliculasLiveData == null) {
            listaDePeliculasLiveData = new MutableLiveData<>();
            listaDePeliculasLiveData.setValue(listaDePeliculas);
        }
        return listaDePeliculasLiveData;
    }

    //    Generar lista de peliculas
    public void generarPeliculas() {
        listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(new Pelicula("Star Wars: A New Hope (1977)", R.drawable.movie_starwars, "Luke Skywalker se une a un Caballero Jedi, un piloto engreído, un Wookiee y dos droides para salvar la galaxia de la estación de batalla destructora de mundos del Imperio, mientras también rescata a la Princesa Leia del malvado Darth Vader.", "Mark Hamill, Harrison Ford, Carrie Fisher, Peter Cushing, Alec Guinness, Anthony Daniels", "George Lucas"));
        listaDePeliculas.add(new Pelicula("Raiders of the Lost Ark (1981)", R.drawable.movie_raiders_of_the_lost_ark, "El arqueólogo y aventurero Indiana Jones es contratado por el gobierno de los Estados Unidos para encontrar el Arca de la Alianza antes que los nazis.", "Luke Skywalker", "Steven Spielberg"));
        listaDePeliculas.add(new Pelicula("The Matrix (1999)", R.drawable.movie_matrix, "Un pirata informático aprende de misteriosos rebeldes sobre la verdadera naturaleza de su realidad y su papel en la guerra contra sus controladores.", "Harrison Ford, Karen Allen, Paul Freeman, Ronald Lacey, John Rhys-Davies", "Joss Whedon"));
        listaDePeliculas.add(new Pelicula("Jurassic Park (1993)", R.drawable.movie_jurassic_park, "Un multimillonario excéntrico construye un parque temático con clones de dinosaurios reales, pero cuando un sabotaje deja a los visitantes atrapados en la isla con los dinosaurios sueltos, la aventura se convierte en una lucha por la supervivencia.", "Sam Neill, Laura Dern, Jeff Goldblum, Richard Attenborough, Bob Peck, Martin Ferrero", "Steven Spielberg"));
        listaDePeliculas.add(new Pelicula("The Avengers (2012)", R.drawable.movie_avengers, "Cuando un poderoso enemigo amenaza el mundo, Nick Fury, el director de la agencia internacional de paz conocida como SHIELD, reúne a un equipo de superhéroes para salvar al mundo de un desastre inminente.", "Robert Downey Jr., Chris Evans, Chris Hemsworth, Scarlett Johansson, Mark Ruffalo, Jeremy Renner, Tom Hiddleston", "Joss Whedon"));
    }
}
