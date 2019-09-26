package com.example.compath;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.compath.Profile.ProfileFragment;
import com.example.compath.Search.SearchFragment;
import com.example.compath.UI.CurvedBottomNavigationView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private SearchFragment searchFragment;
    private ProfileFragment profileFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);

        CurvedBottomNavigationView curvedBottomNavigationView = findViewById(R.id.customBottomBar);
        curvedBottomNavigationView.inflateMenu(R.menu.bottom_menu);
        curvedBottomNavigationView.setSelectedItemId(R.id.search);

        fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        searchFragment = new SearchFragment();
        fragmentTransaction.add(R.id.frameLayout, searchFragment).commit();


        curvedBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                switch (menuItem.getItemId()) {
                    case R.id.search:
                        searchFragment = new SearchFragment();
                        fragmentTransaction.replace(R.id.frameLayout, searchFragment).commit();
                        break;
                    case R.id.profile:
                        profileFragment = new ProfileFragment();
                        fragmentTransaction.replace(R.id.frameLayout, profileFragment).commit();
                        break;
                    default:
                        break;

                }
                return true;
            }
        });

    }
}
