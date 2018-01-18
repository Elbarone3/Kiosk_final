package com.company;

/**
 * Created by woj.ch on 17.1.2018.
 */

public class Zeitscrift extends Artikel {

    public ZeitschriftTyp zeitschriftTyp;


    public Zeitscrift(String artikelBezeichnung, double artikelPreis, int mindestAlter, ZeitschriftTyp zeitschriftTyp) {
        super(artikelBezeichnung, artikelPreis, ArtikelTyp.Zeitschrift, mindestAlter);
        this.zeitschriftTyp = zeitschriftTyp;
    }
}
