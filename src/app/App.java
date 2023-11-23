package app;

import app.army.Army;
import app.battle.Battle;

public class App {

    // fiind random SoldierBuilder, cel mai probabil toate batalioanel o sa aibe toate 3 tipuri de Soldati
    public static void main(String[] args) {
        Army a = new Army("Blue");
        Army b = new Army("Red");

        // Printing army
        System.out.println(a);
        System.out.println(b);

        Battle battle = Battle.getInstance();
        battle.simulateBattle(a, b);
    }
}