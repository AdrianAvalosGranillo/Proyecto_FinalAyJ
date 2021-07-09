package com.example.proyectoayj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Comunicacion extends AppCompatActivity {
    Intent intent9, intent12, intent16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comunicacion);
        intent9 = new Intent(this, WhatsApp.class);
        intent12 = new Intent(this, ZOOM.class);
        intent16 = new Intent(this, GOOGLECLASS.class);
    }

    public void onClick9(View v) {
        startActivity(intent9);

    }
    public void onClick12(View v) {
        startActivity(intent12);

    }
    public void onClick16(View v) {
        startActivity(intent16);

    }
}