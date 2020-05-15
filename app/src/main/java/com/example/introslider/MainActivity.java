package com.example.introslider;

import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.introslider.fragment.daily.daily_fragment;
import com.google.android.material.navigation.NavigationView;
import com.example.introslider.fragment.music_fragment;
import com.example.introslider.fragment.gallery_fragment;
import com.example.introslider.fragment.home.home_fragment;
import com.example.introslider.fragment.profil.profil_fragment;
import com.example.introslider.R;

import static com.example.introslider.R.string.navigation_open;

/*
Waktu pengerjaan : 30-04-2020
Nim              : 10117156
Nama             : Aldi Alfarizi
Kelas            : IF4
*/


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = findViewById(R.id.toolbar_utama);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.draw_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar, navigation_open,R.string.navigation_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null)
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment, new music_fragment()).commit();
        navigationView.setCheckedItem(R.id.nav_list);
    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.nav_homes:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment, new home_fragment()).commit();
                break;
            case R.id.nav_daily:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment, new daily_fragment()).commit();
                break;
            case R.id.nav_list:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment, new music_fragment()).commit();
                break;
            case R.id.nav_grid:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment, new gallery_fragment()).commit();
                break;
            case R.id.nav_profil:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment, new profil_fragment()).commit();
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

        super.onBackPressed();
    }
}
