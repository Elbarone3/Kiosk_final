package com.company;

/**
 * Created by woj.ch on 17.1.2018.
 */
public class Snack extends Artikel{

    public SnackTyp snackTyp;


    public Snack(String artikelBezeichnung, double artikelPreis, int mindestAlter, SnackTyp snackTyp) {
        super(artikelBezeichnung, artikelPreis, ArtikelTyp.Snack, mindestAlter);
        this.snackTyp = snackTyp;
    }
}
