package com.example.proyectoayj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PresentacionesActivas extends AppCompatActivity {
    Intent intent, intent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentaciones_activas);
        intent=new Intent(this,Prezy.class);
        intent2=new Intent(this,Geneally.class);
    }
    public void onClick (View v){
        startActivity(intent);

    }
    public void onClick1 (View v){
        startActivity(intent2);

    }
}