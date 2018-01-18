package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lieferant {

    private ArrayList<Artikel> artikelInventar = new ArrayList<Artikel>();

    public Lieferant() {

        artikelInventar.add(new Snack("Mars",1.50,0,SnackTyp.Suess));
        artikelInventar.add(new Snack("Twix",1.20,0,SnackTyp.Suess));
        artikelInventar.add(new Alkohol("Heineken",1.00,500,16));
        artikelInventar.add(new SoftDrink("Cola",0.80,0,330));
        artikelInventar.add(new SoftDrink("Fanta",1.60,0,330));
        artikelInventar.add(new Zeitscrift("Playboy",2.00,18,ZeitschriftTyp.International));
        artikelInventar.add(new Snack("Mars",1.50,0,SnackTyp.Suess));
        artikelInventar.add(new Snack("Twix",1.20,0,SnackTyp.Suess));
        artikelInventar.add(new Alkohol("Heineken",1.00,500,16));
        artikelInventar.add(new SoftDrink("Cola",0.80,0,330));
        artikelInventar.add(new SoftDrink("Fanta",1.60,0,330));
        artikelInventar.add(new Zeitscrift("Playboy",2.00,18,ZeitschriftTyp.International));
    }

    public ArrayList<Artikel> getArtikelInventar() {
        return artikelInventar;
    }


}
