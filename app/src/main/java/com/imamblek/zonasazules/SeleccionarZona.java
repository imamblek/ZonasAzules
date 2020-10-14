package com.imamblek.zonasazules;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import com.google.android.gms.maps.model.LatLng;

public class SeleccionarZona extends AppCompatActivity {
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionar_zona);
        RadioButton btnCerdeña = (RadioButton) findViewById(R.id.btnCerdeña);
        RadioButton btnIcaria = (RadioButton) findViewById(R.id.btnIcaria);
        RadioButton btnLoma_Linda = (RadioButton) findViewById(R.id.btnLoma_Linda);
        RadioButton btnNicoya = (RadioButton) findViewById(R.id.btnNicoya);
        RadioButton btnOkinawa = (RadioButton) findViewById(R.id.btnOkinawa);

        btnCerdeña.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double latitud = 40.3210601;
                Double longitud = 9.3297339;
                String nombre_zona = getResources().getString(R.string.Cerdeña);
                Intent intent = new Intent(context,MapsActivity.class);
                intent.putExtra("latitud",latitud);
                intent.putExtra("longitud",longitud);
                intent.putExtra("nombre_zona",nombre_zona);
                startActivity(intent);
            }
        });
        btnIcaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double latitud = 37.599929450000005;
                Double longitud = 26.151689404867284;
                String nombre_zona = getResources().getString(R.string.Icaria);
                Intent intent = new Intent(context,MapsActivity.class);
                intent.putExtra("latitud",latitud);
                intent.putExtra("longitud",longitud);
                intent.putExtra("nombre_zona",nombre_zona);
                startActivity(intent);
            }
        });
        btnLoma_Linda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double latitud = 34.075626;
                Double longitud = -117.25204775;
                String nombre_zona = getResources().getString(R.string.Loma_Linda);
                Intent intent = new Intent(context,MapsActivity.class);
                intent.putExtra("latitud",latitud);
                intent.putExtra("longitud",longitud);
                intent.putExtra("nombre_zona",nombre_zona);
                startActivity(intent);
            }
        });
        btnNicoya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double latitud = 10.1470408;
                Double longitud = -85.4535024;
                String nombre_zona = getResources().getString(R.string.Nicoya);
                Intent intent = new Intent(context,MapsActivity.class);
                intent.putExtra("latitud",latitud);
                intent.putExtra("longitud",longitud);
                intent.putExtra("nombre_zona",nombre_zona);
                startActivity(intent);
            }
        });
        btnOkinawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double latitud = 26.338393;
                Double longitud = 127.806341;
                String nombre_zona = getResources().getString(R.string.Okinawa);
                Intent intent = new Intent(context,MapsActivity.class);
                intent.putExtra("latitud",latitud);
                intent.putExtra("longitud",longitud);
                intent.putExtra("nombre_zona",nombre_zona);
                startActivity(intent);
            }
        });
    }
}