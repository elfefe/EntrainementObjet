package com.felix.EO;

import java.util.HashMap;

public class Elfe extends Personnage {
    public Elfe(){
        setCaracteristique(8,7,9,10);
    }

    @Override
    String communiquer() {
        return null;
    }

    @Override
    int deplacement() {
        return 0;
    }

    @Override
    int attacker() {
        return 0;
    }

    @Override
    boolean fuir() {
        return false;
    }

    @Override
    String inventaire(Ressources[] objet) {
        return null;
    }
}
