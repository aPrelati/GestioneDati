package com.example.gestionedaati;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    EditText titolo;
    EditText autore;
    Spinner spnGenere;
    EditText durata;

    Button inserisci;
    Button visualizza;


    GestioneBrani gb= new GestioneBrani();

    String[] elencoGeneri= {"Rock", "Liscio", "Pop", "Moderno"};


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titolo= (EditText) findViewById(R.id.titolo);
        autore= (EditText) findViewById(R.id.autore);
        durata= (EditText) findViewById(R.id.durata);


        spnGenere= (Spinner) findViewById(R.id.genere);
        ArrayAdapter <String> spGen= new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, elencoGeneri);
        spnGenere.setAdapter(spGen);


        ArrayList<Brano> listaBrani;
        listaBrani= new ArrayList<Brano>();


        inserisci= findViewById(R.id.inserisci);
        inserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String testo= spnGenere.getSelectedItem().toString();
                /*Toast.makeText(getApplicationContext(), testo, Toast.LENGTH_LONG).show();
                gb.addBrano(titolo.getText().toString());*/
                Intent i= new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("genere", testo.toString());
                i.putExtra("titolo", titolo.getText().toString());
                i.putExtra("autore", autore.getText().toString());
                i.putExtra("durata", durata.getText().toString());
                startActivity(i);
            }
        });

        visualizza= findViewById(R.id.visualizza);
        visualizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "visualizza", Toast.LENGTH_LONG).show();
            }
        });
    }
}