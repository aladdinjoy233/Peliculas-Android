package com.example.peliculas;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;

import com.example.peliculas.databinding.ItemPeliculaBinding;
import com.example.peliculas.modelo.Pelicula;

import java.util.List;

public class PeliculaAdapter extends RecyclerView.Adapter<PeliculaAdapter.ViewHolder> {
    private Context context;
    private List<Pelicula> peliculas;
    private LayoutInflater layoutInflater;

    public PeliculaAdapter(Context context, List<Pelicula> peliculas, LayoutInflater layoutInflater) {
        this.context = context;
        this.peliculas = peliculas;
        this.layoutInflater = layoutInflater;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemPeliculaBinding binding = ItemPeliculaBinding.inflate(layoutInflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.binding.tvTitulo.setText(peliculas.get(position).getTitulo());
        holder.binding.tvDescripcion.setText(String.valueOf(peliculas.get(position).getResenia()));
        holder.binding.ivFoto.setImageResource(peliculas.get(position).getImagenResId());
    }

    @Override
    public int getItemCount() { return peliculas.size(); }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ItemPeliculaBinding binding;
        PeliculaAdapterViewModel viewModel;

        public ViewHolder(@NonNull ItemPeliculaBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
            viewModel = new ViewModelProvider((ViewModelStoreOwner) binding.getRoot().getContext()).get(PeliculaAdapterViewModel.class);

            binding.btnDetalle.setOnClickListener(v -> {
                viewModel.abrirDetalle(peliculas.get(getAdapterPosition()));
            });
        }
    }


}
