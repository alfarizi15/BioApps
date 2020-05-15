package com.example.introslider.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.introslider.fragment.Model_gallery;
import com.example.introslider.R;

import java.util.List;

public class AdapterGallery extends RecyclerView.Adapter<AdapterGallery.ViewHolder> {
    List<Model_gallery> biolistgallery;

    public AdapterGallery(List<Model_gallery> animelistcomedy) {
        this.biolistgallery = animelistcomedy;
    }

    @NonNull
    @Override
    public AdapterGallery.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_grid, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageComedy.setImageResource(biolistgallery.get(position).getImage());
        holder.nameComedy.setText(biolistgallery.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return biolistgallery.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageComedy;
        TextView nameComedy;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageComedy = itemView.findViewById(R.id.image_grid_view);
            nameComedy = itemView.findViewById(R.id.text_name_grid);
        }
    }
}
