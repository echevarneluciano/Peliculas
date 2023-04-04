package com.example.peliculas.modelo;

import java.io.Serializable;

public class Pelicula implements Serializable {
    private String titulo;
    private int imagenUrl;
    private String resenia;
    private String actores;
    private String director;

    public Pelicula(String titulo, int imagenUrl, String resenia, String actores, String director) {
        this.titulo = titulo;
        this.imagenUrl = imagenUrl;
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

    public int getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(int imagenUrl) {
        this.imagenUrl = imagenUrl;
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
}
