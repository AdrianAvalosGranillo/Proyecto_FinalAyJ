package com.example.proyectoayj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WhatsApp2 extends AppCompatActivity {
    Intent intent11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whats_app2);
        intent11 = new Intent(this, MainActivity.class);
    }
    public void onClick11(View v) {
        startActivity(intent11);

    }
}