package com.example.introslider.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.introslider.adapter.AdapterMusic;
import com.example.introslider.R;

import java.util.ArrayList;
import java.util.List;

/*
Waktu pengerjaan : 30-04-2020
Nim              : 10117156
Nama             : Aldi Alfarizi
Kelas            : IF4
*/

public class music_fragment extends Fragment {
    RecyclerView recyclerView;
    List<Model_music> biolist;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_music, container, false);




        recyclerView= view.findViewById(R.id.list_item_action);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        DataMusic();

        recyclerView.setAdapter(new AdapterMusic(DataMusic()));
        return view;
    }
    private List<Model_music> DataMusic() {
        biolist = new ArrayList<>();
        biolist.add(new Model_music(R.drawable.bili,"Xanny - Bille Ellish"));
        biolist.add(new Model_music(R.drawable.malone,"I fall Apart - Post Malone"));
        biolist.add(new Model_music(R.drawable.traviss1,"Sicko Mode - Travis Scott"));
        biolist.add(new Model_music(R.drawable.drake,"Nonstop - Drake"));
        biolist.add(new Model_music(R.drawable.burbank,"Sorry i like u - Burbank"));
        biolist.add(new Model_music(R.drawable.unravel,"Unravel - Tosite Sigarue"));
        return biolist;
    }


}
