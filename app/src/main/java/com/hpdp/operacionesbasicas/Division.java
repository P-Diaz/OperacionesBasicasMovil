package com.hpdp.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Division extends AppCompatActivity {
    EditText edNumero1, edNumero2;
    TextView tvResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);
        edNumero1 = findViewById(R.id.txtNumeroD1);
        edNumero2 = findViewById(R.id.txtNumeroD2);
        tvResultado = findViewById(R.id.lblResultadoDivision);
    }
    public void CalcularDivision(View v){
        double num1 = Double.parseDouble(edNumero1.getText().toString());
        double num2 = Double.parseDouble(edNumero2.getText().toString());
        if (num2 != 0 ){
            double resultado = num1 / num2;
            tvResultado.setText(resultado+"");
        } else {
            Toast.makeText(Division.this, "No es posible dividir para 0", Toast.LENGTH_LONG).show();
        }


    }
}