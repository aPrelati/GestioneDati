package com.example.gestionedaati;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText titolo;
    Button inserisci;
    Button visualizza;

    GestioneBrani gb= new GestioneBrani();


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titolo= (EditText) findViewById(R.id.titolo);
        inserisci= findViewById(R.id.inserisci);

        inserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gb.addBrano(titolo.getText().toString());
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