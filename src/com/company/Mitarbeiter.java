package com.company;

import java.awt.*;
import java.io.Console;
import java.util.ArrayList;

public class Mitarbeiter {
    private String mitarbeiterName;
    private Kiosk kioskId;

    public Mitarbeiter(String mitarbeiterName, Kiosk kioskId) {
        this.mitarbeiterName = mitarbeiterName;
        this.kioskId = kioskId;
    }


    void openKiosk(Kiosk kiosk){
        kiosk.setKioskStatus("Offen");
        System.out.println("Der kiosk wurde geoeffnet");
    }

    void closeKiosk(Kiosk kiosk){
        kiosk.setKioskStatus("Geschlossen");
        System.out.println("Der kiosk wurde geschlossen");
    }

    void sellProduct(Artikel artikel){
        if(artikel.getMindestAlter() > 0){
            System.out.println("Mindestalter ist "+artikel.getMindestAlter() + ".Alter ueberpruefen ");

        }
    }

    void orderProduct(String artikelBezeichnung, int artikelMenge, Lieferant lieferant ){
        ArrayList<Artikel> artikelListe = new ArrayList<Artikel>();
        artikelListe = lieferant.getArtikelInventar();

        for(int i=0; i < artikelMenge; i++){

            artikelListe.indexOf()

        }


    }
}
