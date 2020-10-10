package com.proyectoclase.listactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Ciudades extends AppCompatActivity {

    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciudades);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        String txt = intent.getStringExtra("NOMBRE");
        name = findViewById(R.id.txtName);
        name.setText("Bienvenido a la ciudad de "+txt);

    }
}