package com.felix.EO;

public class Main {
    public static void main(String[] args) {
        Elfe monJoueur = new Elfe("El'efeha");
        Elfe mechant = new Elfe("Ahefe'le");
        System.out.println("\n"+monJoueur.caracteristique+"\n");
        System.out.println(monJoueur.getObjets("flux"));
        System.out.println("Vous infligez " + monJoueur.attacker("flux",mechant) + " dégats");
        System.out.println("Il reste " + mechant.caracteristique.get("Vie") + " à " + mechant.nom);
    }
}
