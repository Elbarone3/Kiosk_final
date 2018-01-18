package com.company;

/**
 * Created by woj.ch on 17.1.2018.
 */
public class Alkohol extends Artikel {

    private int anzahlMilliliter;

    public Alkohol(String artikelBezeichnung, double artikelPreis, int mindestAlter, int anzahlMilliliter) {
        super(artikelBezeichnung, artikelPreis, ArtikelTyp.Alkohol, mindestAlter);
        this.anzahlMilliliter = anzahlMilliliter;
    }
}
