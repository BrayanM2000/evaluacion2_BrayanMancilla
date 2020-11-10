package com.example.ev2_brayan_pama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String correo = "admin@mail.com";
    String clave = "admin123";
    EditText edtMain_correo;
    EditText edtMain_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }//fin if

        edtMain_correo = (EditText) findViewById(R.id.edtMain_correo);
        edtMain_password = (EditText) findViewById(R.id.edtMain_password);

    }//fin on create

    //al hacer click en el boton iniciar sesion llevara al HOME
    public void goToHomePage(View view) {
        if (correo.equals(edtMain_correo.getText().toString()) && clave.equals(edtMain_password.getText().toString())) {
            Intent activity = new Intent(this, Home.class);
            startActivity(activity);
            Toast.makeText(this, "Bienvenido a empresas PAMA", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
        }//fin if


    }//fin public class

    public void goToCrearCuenta(View view) {

        Intent activity = new Intent(this, CrearCuenta.class);
        startActivity(activity);
        Toast.makeText(this, "Complete los campos solicitados", Toast.LENGTH_SHORT).show();
    }
}