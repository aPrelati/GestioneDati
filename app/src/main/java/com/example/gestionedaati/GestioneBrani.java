package com.example.gestionedaati;

import android.widget.Toast;

import java.util.ArrayList;

public class GestioneBrani
{
    ArrayList <Brano> listaBrani;

    public GestioneBrani()
    {
        listaBrani= new ArrayList<Brano>();
    }

    public void addBrano(String titolo, String autore, String genere, String durata) //sul pulsante inserisci
    {
        Brano br= new Brano(titolo, autore, genere, durata);
        listaBrani.add(br); //metodo che mi permette di inserire gli oggetti
    }

    public String listaSong() //sul pulsante visualizza
    {
        StringBuilder sbSogn= new StringBuilder();

        for(Brano brc : listaBrani) //brc è l'istanza della classe brano per ogni lista brano aggiungo un elemento
        {
            sbSogn.append(brc.getTitolo().toString()+"-");
            sbSogn.append(brc.getAutore().toString()+"-");
            sbSogn.append(brc.getGenere().toString()+"-");
            sbSogn.append(brc.getDurata().toString()+"\n\n");
        }
        return sbSogn.toString();
    }


}
