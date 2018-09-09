package com.felix.EO;

public class Elfe extends Personnage{
    private int AVANCER = 1;
    private int RECULER = 2;


    public Elfe(String nom){
        this.nom = nom;
        setCaracteristique(8,7,9,10);
    }

    @Override
    void inventaire(String objet) {
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
