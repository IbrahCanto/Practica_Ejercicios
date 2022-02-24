package com.example.ejerciciospractica;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ano_Bisiesto extends AppCompatActivity {
    EditText Anio;
    Button verificar;
    TextView respuesta;
    AlertDialog.Builder dialogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ano_bisiesto);

        Anio = (EditText) findViewById(R.id.edtxtAnio);
        verificar = (Button) findViewById(R.id.btnVerificar);
        respuesta = (TextView) findViewById(R.id.resultado);

    }

    public void Bisiesto (View view){

        int anio = Integer.parseInt(Anio.getText().toString());

        if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
            respuesta.setText("El año " + Anio.getText() + " es bisiesto");
        } else {
            respuesta.setText("El año " + Anio.getText() + " no es bisiesto");
        }
    }

    public void Anterior (View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);

    }
}
