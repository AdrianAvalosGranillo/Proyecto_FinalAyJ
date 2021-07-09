package com.example.proyectoayj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Prezy extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prezy);
        intent=new Intent(this,PREZY2.class);
    }
    public void onClick (View v){
        startActivity(intent);

    }
}