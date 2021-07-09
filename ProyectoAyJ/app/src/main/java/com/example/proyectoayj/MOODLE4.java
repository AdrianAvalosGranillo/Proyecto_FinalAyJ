package com.example.proyectoayj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MOODLE4 extends AppCompatActivity {
    Intent intent22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moodle4);
        intent22=new Intent(this,MainActivity.class);
    }
    public void onClick(View v){
        startActivity(intent22);

    }
}