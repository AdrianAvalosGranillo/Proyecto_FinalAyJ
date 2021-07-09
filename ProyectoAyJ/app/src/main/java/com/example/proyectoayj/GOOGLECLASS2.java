package com.example.proyectoayj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GOOGLECLASS2 extends AppCompatActivity {
    Intent intent18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_googleclass2);
        intent18 = new Intent(this, GOOGLECLASS3.class);
    }
    public void onClick18(View v) {
        startActivity(intent18);

    }
}