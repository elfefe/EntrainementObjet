package com.felix.EO;

import java.util.HashMap;

public abstract class Creature {
    protected String nom;
    protected HashMap<String,Integer> caracteristique;

    abstract int attacker();
    abstract boolean fuir();
    abstract void inventaire(Ressources[] objet);

    protected void setCaracteristique(int force, int resistance,int intelligence,int agilite){
        caracteristique = new HashMap<>();
        caracteristique.put("Force",0);
        caracteristique.put("Resistance",0);
        caracteristique.put("Intelligence",0);
        caracteristique.put("Agilité",0);
        caracteristique.put("Vie",100);
    }
}
