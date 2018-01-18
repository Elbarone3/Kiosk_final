package com.company;

public class Main {

    private String[] kioskMitarbeiter = {"David Keller", "Jorden Wondergem"};

    private Artikel[] kioskArtikel = {
            new Snack("Mars",1.50, 0,SnackTyp.Suess),
            new Snack("Twix",1.20, 0, SnackTyp.Suess),
            new Alkohol("Heineken", 1.00, 500, 16),
            new SoftDrink("Cola", 0.80, 0,330),
            new SoftDrink("Fanta", 1.60, 0,330),
            new Zeitscrift("Playboy", 2.00, 18,ZeitschriftTyp.International)
    };

    private Lieferant sugusAg = new Lieferant();

    public static void main(String[] args) {



    }
}
