package com.company;

public class Kiosk {
    private String kioskName;
    private String kioskStandort;

    private String kioskStatus;
    private Mitarbeiter[] kioskMitarbeiter;
    private Artikel[] kioskArtikel;
    private double kioskKasse;
    private String kioskLieferant;

    public Kiosk(String kioskName, String kioskStandort, String kioskStatus, Artikel[] kioskArtikel, double kioskKasse, String kioskLieferant) {
        this.kioskName = kioskName;
        this.kioskStandort = kioskStandort;
        this.kioskStatus = kioskStatus;
        this.kioskMitarbeiter = kioskMitarbeiter;
        this.kioskArtikel = kioskArtikel;
        this.kioskKasse = kioskKasse;
        this.kioskLieferant = kioskLieferant;
    }

    public void setKioskStatus(String kioskStatus) {
        this.kioskStatus = kioskStatus;
    }

}
