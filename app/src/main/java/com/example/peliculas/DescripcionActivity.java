package com.example.peliculas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.peliculas.databinding.ActivityDescripcionBinding;
import com.example.peliculas.databinding.ActivityMainBinding;
import com.example.peliculas.modelo.Pelicula;

public class DescripcionActivity extends AppCompatActivity {

    private ActivityDescripcionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion);
        binding = ActivityDescripcionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle pelicula = getIntent().getExtras();
       Pelicula p = (Pelicula) pelicula.getSerializable("pelicula");
        binding.tvResenia.setText(p.getResenia());
        binding.ivFotoPeli.setImageResource(p.getImagenUrl());
        binding.tvActores.setText(p.getActores());
        binding.tvDirector.setText(p.getDirector());
        binding.tvTituloPeli.setText(p.getTitulo());
    }
}