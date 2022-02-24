package com.example.ejerciciospractica;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Promedio extends AppCompatActivity {
    EditText ediTMateria1, ediTMateria2, ediTMateria3, ediTMateria4, ediTMateria5, ediTMateria6;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promedio);
        ediTMateria1=(EditText)findViewById(R.id.ediT1);
        ediTMateria2=(EditText)findViewById(R.id.ediT2);
        ediTMateria3=(EditText)findViewById(R.id.ediT3);
        ediTMateria4=(EditText)findViewById(R.id.ediT4);
        ediTMateria5=(EditText)findViewById(R.id.ediT5);
        ediTMateria6=(EditText)findViewById(R.id.ediT6);
        txtResultado=(TextView) findViewById(R.id.txtVResult);

    }

    public void Calcular (View view) {


        String Mat1 = ediTMateria1.getText().toString();
        String Mat2 = ediTMateria2.getText().toString();
        String Mat3 = ediTMateria3.getText().toString();
        String Mat4 = ediTMateria4.getText().toString();
        String Mat5 = ediTMateria5.getText().toString();
        String Mat6 = ediTMateria6.getText().toString();

        int val1 = Integer.parseInt(Mat1);
        int val2 = Integer.parseInt(Mat2);
        int val3 = Integer.parseInt(Mat3);
        int val4 = Integer.parseInt(Mat4);
        int val5 = Integer.parseInt(Mat4);
        int val6 = Integer.parseInt(Mat4);

        int promedio=(val1+val2+val3+val4+val5+val6)/6;
        if (promedio>=6){
            txtResultado.setText("Resultado: " + promedio);
        } else if (promedio<=5){
            txtResultado.setText("Resultado: " + promedio);
        }

    }





    public void Anterior (View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);

    }

}