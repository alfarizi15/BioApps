package com.example.introslider.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.introslider.R;
import com.example.introslider.fragment.daily.Model_daily2;

import java.util.List;

public class Adapterdaily2 extends RecyclerView.Adapter<Adapterdaily2.ViewHolder> {
    List<Model_daily2> biolistgallery;

    public Adapterdaily2(List<Model_daily2> animelistcomedy) {
        this.biolistgallery = animelistcomedy;
    }

    @NonNull
    @Override
    public Adapterdaily2.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
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
