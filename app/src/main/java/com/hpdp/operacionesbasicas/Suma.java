package com.hpdp.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Suma extends AppCompatActivity {
    EditText edNumero1, edNumero2;
    TextView tvResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edNumero1 = findViewById(R.id.txtNumero1);
        edNumero2 = findViewById(R.id.txtNumero2);
        tvResultado = findViewById(R.id.lblResultado);
    }

    public void CalcularSuma(View v){
        double num1 = Double.parseDouble(edNumero1.getText().toString());
        double num2 = Double.parseDouble(edNumero2.getText().toString());
        double resultado = num1 + num2;
        tvResultado.setText(resultado+"");
    }
}