package com.felix.EO;

import java.util.HashMap;

public class Elfe extends Personnage implements Ressources{
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
    int attacker() {
        return 0;
    }

    @Override
    boolean fuir() {
        return false;
    }
}
