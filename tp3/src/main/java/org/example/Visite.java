package org.example;

public class Visite {
    private String nom;
    private String date;
    private int note;

    public Visite(String nom, String date, int note) {
        this.nom = nom;
        this.date = date;
        this.note = note;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String toString() {
        return "Nom: " + this.getNom() + " Date: " + this.getDate() + " Note: " + this.getNote();
    }
}
