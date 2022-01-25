package com.example.gestionedaati;

import android.content.Intent;
import android.util.Log;

import java.util.Date;

public class Brano
{
    private static final String TAG= Brano.class.getSimpleName();

    private String titolo;
    private String autore;
    private String genere;
    private String durata; //integer è la classe degli interi che offre dei metodi sennò bisognava usare int con la i minuscola

    public Brano(String titolo, String autore, String genere, String durata)
    {
        this.titolo= titolo;
        this.autore= autore;
        this.genere= genere;
        this.durata= durata;
        Log.d(TAG, "Dentro il costruttore Brano");
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getDurata() {
        return durata;
    }

    public void setDurata(String durata) {
        this.durata = durata;
    }
}
