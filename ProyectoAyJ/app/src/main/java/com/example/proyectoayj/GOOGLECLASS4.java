package com.example.proyectoayj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GOOGLECLASS4 extends AppCompatActivity {
    Intent intent20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_googleclass4);
        intent20 = new Intent(this, GOOGLECLASS5.class);
    }
    public void onClick20(View v) {
        startActivity(intent20);

    }
}