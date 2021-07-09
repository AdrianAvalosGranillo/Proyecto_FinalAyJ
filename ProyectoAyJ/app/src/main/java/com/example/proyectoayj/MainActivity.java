package com.example.proyectoayj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent intent, intent1, intent2, intent3, intent4, intent5, intent6, intent7, intent8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent1=new Intent(this,Comunicacion.class);
        intent2=new Intent(this,Elearning.class);
        intent3=new Intent(this,PresentacionesActivas.class);
        intent4=new Intent(this,APPrealidadaumentada.class);
        intent5=new Intent(this,AnimacionYCreacionVideo.class);
        intent7=new Intent(this,RepositorioAudioVisual.class);
        intent8=new Intent(this,CuraciondeContenido.class);
        intent6=new Intent(this,Gamificacion.class);
        intent=new Intent(this,Inicio.class);
    }
    public void onClick (View v){
        startActivity(intent);

    }
    public void onClick1 (View v){
        startActivity(intent1);

    }
    public void onClick2 (View v){
        startActivity(intent2);

    }
    public void onClick3(View v){
        startActivity(intent3);

    }
    public void onClick4(View v){
        startActivity(intent4);

    }
    public void onClick5 (View v){
        startActivity(intent5);

    }
    public void onClick6 (View v){
        startActivity(intent6);

    }
    public void onClick7 (View v){
        startActivity(intent7);

    }
    public void onClick8(View v){
        startActivity(intent8);

    }
}