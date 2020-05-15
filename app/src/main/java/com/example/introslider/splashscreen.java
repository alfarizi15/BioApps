package com.example.introslider;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
/*
Waktu pengerjaan : 30-04-2020
Nim              : 10117156
Nama             : Aldi Alfarizi
Kelas            : IF4
*/

public class splashscreen extends AppCompatActivity {
    private int waktu_loading=4000;

    //4000=4 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent home=new Intent(splashscreen.this, WelcomeActivity.class);
                startActivity(home);
                finish();

            }
        },waktu_loading);
    }
}