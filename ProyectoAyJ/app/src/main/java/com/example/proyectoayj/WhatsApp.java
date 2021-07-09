package com.example.proyectoayj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WhatsApp extends AppCompatActivity {
    Intent intent10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whats_app);
        intent10 = new Intent(this, WhatsApp2.class);
    }
    public void onClick10(View v) {
        startActivity(intent10);

    }

}