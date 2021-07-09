package com.example.proyectoayj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ZOOM extends AppCompatActivity {
    Intent intent13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom);
        intent13 = new Intent(this, ZOOM2.class);
    }
    public void onClick13(View v) {
        startActivity(intent13);

    }
}