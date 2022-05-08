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

public class OpcoesRestaurantesTammy extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opcoes_restaurantes_tammy);
    }

    public void btnTelefonarTammyClick(View v){
        Uri uri = Uri.parse("tel:(1530000000");
        Intent intent;
        intent = new Intent(Intent.ACTION_CALL,uri);

        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE);

        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CALL_PHONE},1);
        } else {
            startActivity(intent);
        }
    }

    public void btnAbrirNavegadorTammyClick(View v){
        Uri uri = Uri.parse("https://www.facebook.com/TammyPastelaria/?msclkid=f648b5f5cf1a11ec9a1b462b551127cf");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

    public void btnAbrirMapaTammyClick(View v){
        Uri uri = Uri.parse("https://www.google.com.br/maps/dir/tammy+pastelaria+maps//@-23.4927239,-47.5013994,13.5z/data=!4m8!4m7!1m5!1m1!1s0x94c58aded2a91cb7:0x5c0e8999bb2a4dd3!2m2!1d-47.4853242!2d-23.5075601!1m0");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}
