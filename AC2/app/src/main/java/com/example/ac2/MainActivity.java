package com.example.ac2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void saibaMaisBigJeffs(View v) {
        Intent intent = new Intent(this, OpcoesRestaurantes.class);
        startActivity(intent);
    }

    public void saibaMaisTammyPastelaria(View v) {
        Intent intent = new Intent(this, OpcoesRestaurantesTammy.class);
        startActivity(intent);
    }

    public void saibaMaisStarbucks(View v) {
        Intent intent = new Intent(this, OpcoesRestaurantesStar.class);
        startActivity(intent);
    }
}