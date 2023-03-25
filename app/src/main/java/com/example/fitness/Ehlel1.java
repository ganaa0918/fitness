package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ehlel1 extends AppCompatActivity {
    Button btn_home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ehlel1);
        btn_home = (Button) findViewById(R.id.workout);
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent work = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(work);
            }
        });
    }
}