package com.example.gestionedaati;

import android.content.Intent;

import java.util.Date;

public class Brano
{
    private String titolo;
    private String autore;
    private String genere;
    private Integer durata;
    private String urlVideo;
    private Date dataLancio;

    public Brano(String titolo)
    {
        this.titolo= titolo;
    }

    public String getTitolo()
    {
        return titolo;
    }

    public void setTitolo(String titolo)
    {
        this.titolo = titolo;
    }

    public String getAutore()
    {
        return autore;
    }

    public void setAutore(String autore)
    {
        this.autore = autore;
    }

    public String getGenere()
    {
        return genere;
    }

    public void setGenere(String genere)
    {
        this.genere = genere;
    }

    public Integer getDurata()
    {
        return durata;
    }

    public void setDurata(Integer durata)
    {
        this.durata = durata;
    }

    public String getUrlVideo()
    {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo)
    {
        this.urlVideo = urlVideo;
    }

    public Date getDataLancio()
    {
        return dataLancio;
    }

    public void setDataLancio(Date dataLancio)
    {
        this.dataLancio = dataLancio;
    }
}
