package com.felix.EO;

import java.util.HashMap;

public abstract class Creature implements Ressources {
    protected String nom;
    protected HashMap<String,Integer> caracteristique;
    protected String arme;

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
    protected int perdreVie(Creature ennemi, int degat){
        int vieRetire = degat - (degat -ennemi.caracteristique.get("Resistance"));
        ennemi.caracteristique.replace("Vie",ennemi.caracteristique.get("Vie"),ennemi.caracteristique.get("Vie") - vieRetire);
        return vieRetire;
    }
    int attacker(String arme,Creature ennemi) {
        int attaque = caracteristique.get("Force")+Integer.parseInt(descriptif[objets.get(arme)][1].toString());
        return perdreVie(ennemi,attaque);
    }
}
