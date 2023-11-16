package com.hpdp.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    Button suma, resta, division, multi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        suma = findViewById(R.id.btnSuma);
        resta = findViewById(R.id.btnResta);
        division = findViewById(R.id.btnDivision);
        multi = findViewById(R.id.btnMulti);
    }
}