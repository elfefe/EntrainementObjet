package com.felix.EO;

import java.util.HashMap;

public interface Ressources {
    Object[][] descriptif = new Object[][]
            {
                    {"dague","Une dague de balle manufacture", 3, 0},
                    {"épée","Une épée longue maudite",2,1},
                    {"flux","Une ancienne magie",1,2}
            };

    HashMap<String, Integer> objets = new HashMap<>();

    default String getObjets(String recherche) {
        for (int x=0;x<descriptif.length;x++){
            objets.put(descriptif[x][0].toString(),x);
        }
        String objet = "Objet: "+descriptif[objets.get(recherche)][0]
                                +"\nDescription: "+descriptif[objets.get(recherche)][1]
                                +"\nAttaque: "+descriptif[objets.get(recherche)][2]
                                +"\nDefense: "+descriptif[objets.get(recherche)][3];
        return  objet;
    }
}
