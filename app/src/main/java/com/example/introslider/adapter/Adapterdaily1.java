package com.example.introslider.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.introslider.R;
import com.example.introslider.fragment.daily.Model_daily1;

import java.util.List;

public class Adapterdaily1 extends RecyclerView.Adapter<Adapterdaily1.ViewHolder> {
    List<Model_daily1> biolistaction;

    public Adapterdaily1(List<Model_daily1> animelist) {
        this.biolistaction = animelist;
    }

    @NonNull
    @Override
    public Adapterdaily1.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull Adapterdaily1.ViewHolder holder, int position) {
        holder.imageAction.setImageResource(biolistaction.get(position).getImage());
        holder.nameAction.setText(biolistaction.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return biolistaction.size();
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
