package com.example.proyectoayj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Gamificacion extends AppCompatActivity {
    Intent intent, intent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamificacion);
        intent=new Intent(this,Kahoot.class);
        intent2=new Intent(this,Quizziz.class);
    }
    public void onClick (View v){
        startActivity(intent);

    }
    public void onClick2 (View v){
        startActivity(intent2);

    }
}