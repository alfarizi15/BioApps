package com.example.introslider.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.introslider.fragment.Model_music;
import com.example.introslider.R;

import java.util.List;

public class AdapterMusic extends RecyclerView.Adapter<AdapterMusic.ViewHolder> {
    List<Model_music> animelistaction;

    public AdapterMusic(List<Model_music> animelist) {
        this.animelistaction = animelist;
    }

    @NonNull
    @Override
    public AdapterMusic.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull AdapterMusic.ViewHolder holder, int position) {
        holder.imageAction.setImageResource(animelistaction.get(position).getImage());
        holder.nameAction.setText(animelistaction.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return animelistaction.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageAction;
        TextView nameAction;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageAction = itemView.findViewById(R.id.image_listview);
            nameAction = itemView.findViewById(R.id.text_name);
        }
    }
}
