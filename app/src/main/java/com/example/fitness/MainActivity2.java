package com.example.fitness;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity2 extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    Home home = new Home();
    Workout workout = new Workout();
    Activity activity = new Activity();
    Profile profile = new Profile();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bottomNavigationView = findViewById(R.id.bottomNavigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, home).commit();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected( MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, home).commit();
                        return true;
                    case R.id.workout:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, workout).commit();
                        return true;
                    case R.id.activity:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, activity).commit();
                        return true;
                    case R.id.profile:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, profile).commit();
                        return true;

                }
                return false;
            }
        });



    }
}