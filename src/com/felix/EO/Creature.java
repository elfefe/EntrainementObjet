package com.felix.EO;

import java.util.HashMap;

public abstract class Creature {
    protected String nom;
    protected HashMap<String,Integer> caracteristique;

    abstract int attacker(String arme);
    abstract boolean fuir();
    abstract void inventaire(String objet);

    protected void setCaracteristique(int force, int resistance,int intelligence,int agilite){
        caracteristique = new HashMap<>();
        caracteristique.put("Force",force);
        caracteristique.put("Resistance",resistance);
        caracteristique.put("Intelligence",intelligence);
        caracteristique.put("Agilité",agilite);
        caracteristique.put("Vie",100);
    }
}
