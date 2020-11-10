package com.example.ev2_brayan_pama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class CrearCuenta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cuenta);
    }

    public void goToLogin(View view) {

        Intent activity = new Intent(this, MainActivity.class);
        startActivity(activity);

    }

}//FIN CLASE