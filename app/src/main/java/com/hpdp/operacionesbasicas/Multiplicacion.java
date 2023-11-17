package com.hpdp.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Multiplicacion extends AppCompatActivity {

    EditText edNumero1, edNumero2;
    TextView tvResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicacion);
        edNumero1 = findViewById(R.id.txtNumeroMu1);
        edNumero2 = findViewById(R.id.txtNumeroMu2);
        tvResultado = findViewById(R.id.lblResultadoMulti);
    }
    public void CalcularMulti(View v){
        double num1 = Double.parseDouble(edNumero1.getText().toString());
        double num2 = Double.parseDouble(edNumero2.getText().toString());
        double resultado = num1 * num2;
        tvResultado.setText(resultado+"");
    }
}