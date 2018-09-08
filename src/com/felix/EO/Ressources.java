package com.felix.EO;

import java.util.HashMap;

public interface Ressources {
    Object[][] descriptif = new Object[][]
            {
                    {"Une dague de balle manufacture", 3, 0},
                    {"Une épée longue maudite",2,1},
                    {"Une ancienne magie",1,2}
            };

    HashMap<String, Integer> objets = new HashMap<>();

    default String getObjets(String recherche) {
        objets.put("dague",0);
        objets.put("épée",1);
        objets.put("flux",2);
        String objet = "Objet: "+recherche
                                +"\nDescription: "+descriptif[objets.get(recherche)][0]
                                +"\nAttaque: "+descriptif[objets.get(recherche)][1]
                                +"\nDefense: "+descriptif[objets.get(recherche)][2];
        return  objet;
    }
}
