package com.ednan.projeto2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // properties
    private EditText editPrecoAlcool, ediPrecoGasolina;
    private TextView textResultado;

    // main method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecoAlcool = findViewById(R.id.editAlcool);
        ediPrecoGasolina = findViewById(R.id.editGasolina);
        textResultado = findViewById(R.id.textResultado);
    }

    // functions
    public void calcularPreco(View view) {
        Double precoAlcool = Double.parseDouble(editPrecoAlcool.getText().toString()); // converts the String to Double
        Double precoGasolina = Double.parseDouble(ediPrecoGasolina.getText().toString());

        // cálculo
        Double resultado = precoAlcool / precoGasolina;

        if(resultado >= 0.7) {
            textResultado.setText("Melhor utilizar gasolina!");
        } else {
            textResultado.setText("Melhor utilizar álcool!");
        }
    }
}