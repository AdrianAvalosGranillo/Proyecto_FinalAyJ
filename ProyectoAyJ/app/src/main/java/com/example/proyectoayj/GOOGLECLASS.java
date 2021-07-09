package com.example.proyectoayj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GOOGLECLASS extends AppCompatActivity {
    Intent intent17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_googleclass);
        intent17 = new Intent(this, GOOGLECLASS2.class);
    }
    public void onClick17(View v) {
        startActivity(intent17);

    }
}