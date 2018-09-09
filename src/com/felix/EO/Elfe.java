package com.felix.EO;

public class Elfe extends Personnage{
    private int AVANCER = 1;
    private int RECULER = 2;
    public String monArme;


    public Elfe(String nom){
        this.nom = nom;
        setCaracteristique(8,7,9,10);
        inventaire();
    }

    @Override
    void inventaire() {
        monArme = descriptif[0][0].toString();
    }

    @Override
    String communiquer(String dire) {
        return dire;
    }

    @Override
    int deplacement(int bouger) {
        return bouger;
    }


    @Override
    boolean fuir() {
        return false;
    }
}
