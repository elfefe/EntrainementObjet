package com.felix.EO;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public interface Map {
    Random rand = new Random();
    LinkedList route = new LinkedList();
    int chance = rand.nextInt(10 - 1 + 1) + 0;
    ArrayList<String> situation = new ArrayList<>();

    default void parcourir(){
    }
    private void monde(){
        situation.add("Gobelin");
        situation.add("Elfe");
        situation.add("Elementaire");
        situation.add("Centaure");
        situation.add("Centpied");
        situation.add("Demon");
        situation.add("Coffre");
        situation.add("Chimere");
    }
}
