package com.example.peliculas.modelo;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Pelicula implements Serializable {
    private String titulo, resenia, actores, director;
    private int imagenResId;

    public Pelicula(String titulo, int imagenUrl, String resenia, String actores, String director) {
        this.titulo = titulo;
        this.imagenResId = imagenUrl;
        this.resenia = resenia;
        this.actores = actores;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImagenResId() {
        return imagenResId;
    }

    public void setImagenResId(int imagenUrl) {
        this.imagenResId = imagenUrl;
    }

    public String getResenia() {
        return resenia;
    }

    public void setResenia(String resenia) {
        this.resenia = resenia;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @NonNull
    @Override
    public String toString() {
        return "Pelicula{" + "titulo='" + titulo + '\'' + ", imagenId='" + imagenResId + '\'' + ", resenia='" + resenia + '\'' + ", actores='" + actores + '\'' + ", director='" + director + '\'' + '}';
    }
}
