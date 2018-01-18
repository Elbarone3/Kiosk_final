package com.company;

public class SoftDrink extends Artikel {

    private int anzahMilliliter;

    public SoftDrink(String artikelBezeichnung, double artikelPreis, int mindestAlter, int anzahMilliliter) {
        super(artikelBezeichnung, artikelPreis, ArtikelTyp.Softdrinks, mindestAlter);
        this.anzahMilliliter = anzahMilliliter;
    }
}
