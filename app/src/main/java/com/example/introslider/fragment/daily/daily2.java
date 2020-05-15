package com.example.introslider.fragment.daily;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.example.introslider.R;
import com.example.introslider.adapter.Adapterdaily2;

import java.util.ArrayList;
import java.util.List;

public class daily2 extends Fragment {
    RecyclerView recyclerView;
    List<Model_daily2> biolist;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_daily2, container,  false);
        recyclerView= view.findViewById(R.id.list_item_daily2);

      
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        //DataComedy();

        recyclerView.setAdapter(new Adapterdaily2(DataDaily2()));

        return view;
    }
    private List<Model_daily2> DataDaily2() {
        biolist = new ArrayList<>();
        biolist.add(new Model_daily2(R.drawable.arif,"Arif Rahman"));
        biolist.add(new Model_daily2(R.drawable.ashraaf,"Ashraaf "));
        biolist.add(new Model_daily2(R.drawable.ilham,"Ilham Nurjaman"));
        biolist.add(new Model_daily2(R.drawable.nizaar,"Nizar Milfhatul "));
        biolist.add(new Model_daily2(R.drawable.riki,"Riki Ahmad"));
        biolist.add(new Model_daily2(R.drawable.taufik,"Taufik Dermawan"));
        return biolist;
    }
}
