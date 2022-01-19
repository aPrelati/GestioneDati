package com.example.gestionedaati;

import android.widget.Toast;

import java.util.ArrayList;

public class GestioneBrani
{
    ArrayList <Brano> listaBrani;

    public GestioneBrani(){
        listaBrani= new ArrayList<Brano>();
    }

    public String visualizzaTesto(String titolo)
    {
        String testo="";

        return testo;
    }

    public void addBrano(String titolo)
    {
        Brano br= new Brano(titolo);
        listaBrani.add(br); //metodo che mi permette di inserire gli oggetti
    }

    public String visualizzaLista()
    {
        return "ciao";
    }

}
