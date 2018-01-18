package com.company;

public class Artikel {

    private String artikelBezeichnung;
    private double artikelPreis;

    private int mindestAlter = 0;

    private ArtikelTyp artikelKategorie;

    public Artikel(String artikelBezeichnung, double artikelPreis, ArtikelTyp artikelKategorie, int mindestAlter){
        this.artikelBezeichnung = artikelBezeichnung;
        this.artikelPreis = artikelPreis;
        this.artikelKategorie = artikelKategorie;
        this.mindestAlter = mindestAlter;
    }

    public ArtikelTyp getArtikelKategorie() {
        return artikelKategorie;
    }

    public int getMindestAlter() {
        return mindestAlter;
    }
}
