package com.example.proyectoayj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GOOGLECLASS5 extends AppCompatActivity {
    Intent intent21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_googleclass5);
        intent21= new Intent(this, MainActivity.class);
    }
    public void onClick(View v) {
        startActivity(intent21);

    }
}