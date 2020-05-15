package com.example.introslider.fragment.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.example.introslider.R;
import com.example.introslider.fragment.home.home1;
import com.example.introslider.fragment.home.home2;

/*
Waktu pengerjaan : 30-04-2020
Nim              : 10117156
Nama             : Aldi Alfarizi
Kelas            : IF4
*/

public class home_fragment extends Fragment {
Button b1;
Button b2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_home_fragment, container, false);

        b1 = view.findViewById(R.id.buton1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home1 Home1 = new home1();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                FragmentTransaction replace = transaction.replace(R.id.homess, Home1);
                transaction.commit();

            }
        });
        ///buton2
        b2 = view.findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home2 Home2 = new home2();
                FragmentTransaction transaction1 = getFragmentManager().beginTransaction();
                FragmentTransaction replace = transaction1.replace(R.id.homess, Home2);
                transaction1.commit();

            }
        });



        return view;
    }
}
