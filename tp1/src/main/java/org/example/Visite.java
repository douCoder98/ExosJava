package org.example;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author Papa Abdou Mbodji
 * Ce code regroupe les différents scripts pour tester les acquis du cours
 */
public class Visite {
    private String nom;
    private String date;
    private int note;

    Visite(){}

    Visite(String nom, String date, int note) {
        this.nom = nom;
        this.date = date;
        this.note = note;
    }

    public String getNom() {
        return nom;
    }

    public String getDate() {
        return date;
    }

    public int getNote() {
        return note;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String toString() {

        return "Nom: " + this.getNom() + ", Date: " + this.getDate() + ", Note: " + this.getNote();
    }

    public String convertDateUs() {
        Date thisDate = new Date(this.getDate());
        String convDate = DateFormat.getDateInstance(DateFormat.LONG, Locale.US).format(thisDate);

        return convDate;
    }
}