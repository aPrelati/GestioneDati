package com.example.gestionedaati;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity
{
    TextView titoloSLC;
    TextView autoreSLC;
    TextView genereSLC;
    TextView durataSLC;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String titolo= getIntent().getStringExtra("titolo");
        String autore= getIntent().getStringExtra("autore");
        String genere= getIntent().getStringExtra("genere");
        String durata= getIntent().getStringExtra("durata");

        titoloSLC= findViewById(R.id.titoloSLC);
        autoreSLC= (TextView) findViewById(R.id.autoreSLC);
        genereSLC= (TextView) findViewById(R.id.genereSLC);
        durataSLC= (TextView) findViewById(R.id.durataSLC);

        titoloSLC.setText("Titolo: "+titolo);
        autoreSLC.setText("Autore: "+autore);
        genereSLC.setText("Genere: "+genere);
        durataSLC.setText("Durata: "+durata);

    }
}