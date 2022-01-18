package com.example.gestionedaati;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText titolo;
    Button inserisci;
    Button visualizza;
    Spinner spnGenere;

    GestioneBrani gb= new GestioneBrani();

    String[] elencoGeneri= {"Rock", "Liscio", "Pop", "Moderno"};


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnGenere= (Spinner) findViewById(R.id.generi);
        ArrayAdapter <String> spGen= new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, elencoGeneri);
        spnGenere.setAdapter(spGen);

        titolo= (EditText)findViewById(R.id.titolo);

        inserisci= findViewById(R.id.inserisci);
        inserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String testo= spnGenere.getSelectedItem().toString();
                Toast.makeText(getApplicationContext(), testo, Toast.LENGTH_LONG);
                //gb.addBrano(titolo.getText().toString());


            }
        });

        visualizza= findViewById(R.id.visualizza);
        visualizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}