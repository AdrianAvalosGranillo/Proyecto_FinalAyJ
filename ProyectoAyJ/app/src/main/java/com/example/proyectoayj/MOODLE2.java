package com.example.proyectoayj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MOODLE2 extends AppCompatActivity {
    Intent intent22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moodle2);
        intent22=new Intent(this,MOODLE3.class);
    }
    public void onClick(View v){
        startActivity(intent22);

    }
}