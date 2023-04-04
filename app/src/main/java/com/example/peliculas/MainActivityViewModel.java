package com.example.peliculas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.peliculas.modelo.Pelicula;

import java.util.ArrayList;

public class MainActivityViewModel extends ViewModel {
    private MutableLiveData<ArrayList<Pelicula>> lista;
    private ArrayList<Pelicula> peliculas ;

    public MainActivityViewModel() {
        peliculas = new ArrayList<>();
    }

    public LiveData<ArrayList<Pelicula>> getLista() {
        if(this.lista == null){
            this.lista = new MutableLiveData<>();
        }
        return this.lista;
    }

    public void llenarLista(){
        peliculas.add(new Pelicula("El señor de los anillos", R.drawable.imageinm1, "bla bla bla", "J.J. Abrams", "Joss Whedon"));
        peliculas.add(new Pelicula("Star Wars", R.drawable.imagesinm2, "bla bla bla", "J.J. Abrams", "Joss Whedon"));
        peliculas.add(new Pelicula("Transformers", R.drawable.imagesinm3, "bla bla bla", "J.J. Abrams", "Joss Whedon"));
        lista.setValue(peliculas);
    }
}
