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

public class OpcoesRestaurantesStar extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opcoes_restaurantes_starbucks);
    }

    public void btnTelefonarStarClick(View v){
        Uri uri = Uri.parse("tel:1530421400");
        Intent intent;
        intent = new Intent(Intent.ACTION_CALL,uri);

        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE);

        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CALL_PHONE},1);
        } else {
            startActivity(intent);
        }
    }

    public void btnAbrirNavegadorStarClick(View v){
        Uri uri = Uri.parse("https://www.starbucks.com.br/home?msclkid=d0669865cf1d11ec9c581da45e73fcbd");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

    public void btnAbrirMapaStarClick(View v){
        Uri uri = Uri.parse("https://www.google.com.br/search?tbs=lf:1,lf_ui:4&tbm=lcl&sxsrf=ALiCzsYqyrHmsuuSaFppQJLzn14RR7KNlg:1652048781285&q=starbucks+sorocaba&rflfq=1&num=10&rldimm=16071950217956533462#rlfi=hd:;si:16071950217956533462;mv:[[-23.5340196,-47.4634274],[-23.5354012,-47.46414]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!2m1!1e3!3sIAE,lf:1,lf_ui:4");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}
