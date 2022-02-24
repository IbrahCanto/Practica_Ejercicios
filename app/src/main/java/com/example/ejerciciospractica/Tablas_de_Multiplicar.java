package com.example.ejerciciospractica;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tablas_de_Multiplicar extends Activity {
    EditText ediText;
    TextView result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablas_de_multiplicar);

        ediText=(EditText)findViewById(R.id.ediText);
        result=(TextView)findViewById(R.id.result);
    }


    public void Tabla(View view){
        String val1 = ediText.getText().toString();
        int val2 = Integer.parseInt(val1);
        String resultPrint = "";

        for(int i = 1; i <= 10; i++){
            int result = i * val2;
            resultPrint += i+ " x " + val1 + " = " + result + '\n';
        }
        result.setText(resultPrint);
    }


    public void Anterior (View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);

    }


}