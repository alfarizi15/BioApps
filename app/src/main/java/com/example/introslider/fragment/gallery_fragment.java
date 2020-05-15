package com.example.introslider.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.introslider.adapter.AdapterGallery;
import com.example.introslider.R;

import java.util.ArrayList;
import java.util.List;

/*
Waktu pengerjaan : 30-04-2020
Nim              : 10117156
Nama             : Aldi Alfarizi
Kelas            : IF4
*/

public class gallery_fragment extends Fragment {
    RecyclerView recyclerView;
    List<Model_gallery> biolist;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_gallery, container,  false);
        recyclerView= view.findViewById(R.id.list_rcych);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(container.getContext(), 2));
        //DataComedy();

        recyclerView.setAdapter(new AdapterGallery(DataGallery()));

        return view;
    }
    private List<Model_gallery> DataGallery() {
        biolist = new ArrayList<>();
        biolist.add(new Model_gallery(R.drawable.gmbr1,"digang"));
        biolist.add(new Model_gallery(R.drawable.gmbr2,"pulang mudik gays"));
        biolist.add(new Model_gallery(R.drawable.gmbr3,"rancabali"));
        biolist.add(new Model_gallery(R.drawable.gmbr4,"danau rancabali"));
        biolist.add(new Model_gallery(R.drawable.gmbr5,"bali pandawa"));
        biolist.add(new Model_gallery(R.drawable.gmbr6,"bali secret palace"));
        return biolist;
    }
}
