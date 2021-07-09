package com.example.proyectoayj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ZOOM3 extends AppCompatActivity {
    Intent intent15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom3);
        intent15 = new Intent(this, MainActivity.class);
    }
    public void onClick15(View v) {
        startActivity(intent15);

    }
}