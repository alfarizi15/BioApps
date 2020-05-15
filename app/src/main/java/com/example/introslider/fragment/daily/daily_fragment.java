package com.example.introslider.fragment.daily;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.introslider.R;
import com.example.introslider.fragment.daily.daily1;
import com.example.introslider.fragment.daily.daily2;

/*
Waktu pengerjaan : 30-04-2020
Nim              : 10117156
Nama             : Aldi Alfarizi
Kelas            : IF4
*/

public class daily_fragment extends Fragment {
Button b1;
Button b2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_daily_fragment, container, false);

        b1 = view.findViewById(R.id.buton1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                daily1 Daily1 = new daily1();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                FragmentTransaction replace = transaction.replace(R.id.dailyy, Daily1);
                transaction.commit();

            }
        });
        ///buton2
        b2 = view.findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                daily2 Daily2 = new daily2();
                FragmentTransaction transaction1 = getFragmentManager().beginTransaction();
                FragmentTransaction replace = transaction1.replace(R.id.dailyy, Daily2);
                transaction1.commit();

            }
        });



        return view;
    }
}
