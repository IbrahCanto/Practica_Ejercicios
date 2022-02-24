package com.example.ejerciciospractica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button iniciar, salir;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniciar=(Button) findViewById(R.id.btntablas);
        salir=(Button) findViewById(R.id.btncancelar);

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Bloque que se ejecuta
                Toast.makeText(getApplicationContext(), "By Ibrahin Canto Almeida\n" + "Curso de Titulación Lic. en Informatica", Toast.LENGTH_LONG).show();
                Log.i("ERROR1", "Diste click en salir");
                finish();
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });


    }


    public void Tablas_de_Multiplicar (View view){
        Intent tablas1 = new Intent(this, Tablas_de_Multiplicar.class);
        startActivity(tablas1);
    }

    public void Promedio (View view){
        Intent promedio = new Intent(this, Promedio.class);
        startActivity(promedio);
    }

    public void Bisiesto (View view){
        Intent bisiesto = new Intent(this, Ano_Bisiesto.class);
        startActivity(bisiesto);
    }


}