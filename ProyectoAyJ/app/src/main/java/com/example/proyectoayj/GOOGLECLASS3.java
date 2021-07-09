package com.example.proyectoayj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GOOGLECLASS3 extends AppCompatActivity {
    Intent intent19;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_googleclass3);
        intent19 = new Intent(this, GOOGLECLASS4.class);

    }
    public void onClick19(View v) {
        startActivity(intent19);

    }
}