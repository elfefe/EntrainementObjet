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
    int attacker(String arme) {
        int attaque = caracteristique.get("Force")+Integer.parseInt(descriptif[objets.get(arme)][1].toString());
        return attaque;
    }

    @Override
    boolean fuir() {
        return false;
    }
}
