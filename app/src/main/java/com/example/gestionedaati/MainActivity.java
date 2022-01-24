package com.example.gestionedaati;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{

    private static final String TAG= MainActivity.class.getSimpleName();
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

        Log.e(TAG, "Dentro il metodo onCreate"); //"errore" dentro il metodo onCreate

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
                String genere= spnGenere.getSelectedItem().toString();
                gb.addBrano(titolo.getText().toString(), autore.getText().toString(), genere, durata.getText().toString());
            }
        });

        visualizza= findViewById(R.id.visualizza);
        visualizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String listaBrani= gb.listaSong();

                Intent i= new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("listaBrani", listaBrani);
                startActivity(i);
            }
        });
    }
}