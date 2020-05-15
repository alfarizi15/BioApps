package com.example.introslider.fragment.daily;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.introslider.R;
import com.example.introslider.adapter.Adapterdaily1;

import java.util.ArrayList;
import java.util.List;

public class daily1 extends Fragment {
    RecyclerView recyclerView;
    List<Model_daily1> biolist;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_daily1, container, false);
        recyclerView= view.findViewById(R.id.list_item_daily1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        DataAction();

        recyclerView.setAdapter(new Adapterdaily1(DataAction()));

        return view;
    }
    private List<Model_daily1> DataAction() {
        biolist = new ArrayList<>();
        biolist.add(new Model_daily1(R.drawable.date,"01/05/2020 : membuat projek android bio apps"));
        biolist.add(new Model_daily1(R.drawable.date,"26/05/2020 : service motor"));
        biolist.add(new Model_daily1(R.drawable.date,"16/05/2020 : date pacar"));
        biolist.add(new Model_daily1(R.drawable.date,"03/06/2020 : goes rancabali"));
        biolist.add(new Model_daily1(R.drawable.date,"08/06/2020 : masuk kampus setelah corona"));
        return biolist;
    }
}
