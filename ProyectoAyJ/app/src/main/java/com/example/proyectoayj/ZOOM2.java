package com.example.proyectoayj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ZOOM2 extends AppCompatActivity {
    Intent intent14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom2);
        intent14 = new Intent(this, ZOOM3.class);
    }
    public void onClick14(View v) {
        startActivity(intent14);

    }
}