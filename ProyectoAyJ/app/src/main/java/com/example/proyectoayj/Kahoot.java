package com.example.proyectoayj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Kahoot extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kahoot);
        intent=new Intent(this,Kahoot2.class);
    }
    public void onClick (View v){
        startActivity(intent);

    }
}