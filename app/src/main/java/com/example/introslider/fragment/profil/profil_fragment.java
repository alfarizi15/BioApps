package com.example.introslider.fragment.profil;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.introslider.R;
import com.example.introslider.fragment.profil.profil1;
import com.example.introslider.fragment.profil.profil2;
import com.example.introslider.fragment.profil.profil3;
import com.example.introslider.fragment.profil.profil4;

/*
Waktu pengerjaan : 30-04-2020
Nim              : 10117156
Nama             : Aldi Alfarizi
Kelas            : IF4
*/

public class profil_fragment extends Fragment {
Button b1;
Button b2;
Button b3;
Button b4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_profil_fragment, container, false);

        b1 = view.findViewById(R.id.buton1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                profil1 Profil1 = new profil1();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                FragmentTransaction replace = transaction.replace(R.id.profill, Profil1);
                transaction.commit();

            }
        });
        ///buton2
        b2 = view.findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                profil2 Profil2 = new profil2();
                FragmentTransaction transaction1 = getFragmentManager().beginTransaction();
                FragmentTransaction replace = transaction1.replace(R.id.profill, Profil2);
                transaction1.commit();

            }
        });
        //button3
        b3 = view.findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                profil3 Profil3 = new profil3();
                FragmentTransaction transaction1 = getFragmentManager().beginTransaction();
                FragmentTransaction replace = transaction1.replace(R.id.profill, Profil3);
                transaction1.commit();

            }
        });
        //button4
        b4 = view.findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                profil4 Profil4 = new profil4();
                FragmentTransaction transaction1 = getFragmentManager().beginTransaction();
                FragmentTransaction replace = transaction1.replace(R.id.profill,Profil4);
                transaction1.commit();

            }
        });


        return view;
    }
}
