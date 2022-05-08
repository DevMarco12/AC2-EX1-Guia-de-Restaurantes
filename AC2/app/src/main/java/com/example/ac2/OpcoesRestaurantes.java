package com.example.ac2;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class OpcoesRestaurantes extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opcoes_restaurantes);
    }

    public void btnTelefonarClick(View v){
        Uri uri = Uri.parse("tel:01533587810");
        Intent intent;
        intent = new Intent(Intent.ACTION_CALL,uri);

        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE);

        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CALL_PHONE},1);
        } else {
            startActivity(intent);
        }
    }
    public void btnAbrirNavegadorClick(View v){
        Uri uri = Uri.parse("https://www.facebook.com/bigjeffs/?msclkid=d3659ee8cf1611ec99685cee374fc3d7");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

    public void btnAbrirMapaClick(View v){
        Uri uri = Uri.parse("https://www.google.com.br/maps/place/Big+Jeffs+Burger/@-23.5059744,-47.4892935,20.75z/data=!4m5!3m4!1s0x94c58b5430578815:0xc3938b05d3392d58!8m2!3d-23.5059205!4d-47.4891698");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}
