package org.example;

import java.util.ArrayList;

public class Planning {
    private ArrayList<Visite> visites;

    public Planning(ArrayList<Visite> visites) {
        this.visites = visites;
    }

    public ArrayList<Visite> getVisites() {
        return this.visites;
    }

    public void deleteVisite(String nom) {
        for (int i=0; i < this.visites.size(); i++) {
            if (this.visites.get(i).getNom().equals(nom)) {
                this.visites.remove(i);
            }
        }
    }

    public void addVisite(Visite visite) {
        this.visites.add(visite);
    }
}
