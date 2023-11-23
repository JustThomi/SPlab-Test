package app.battle;

import app.army.Army;

public class Battle {
    private static Battle battle_instance =  null;

    private Battle(){
    }

    public void simulateBattle(Army a, Army b){
        System.out.println("\nSimulating battle...");

        int rng = (int)Math.floor(Math.random() * (1 - 0 + 1) + 0);
        switch (rng) {
            case 0:
                System.out.println(a.getName() + " WON!");
                break;
            case 1:
                System.out.println(b.getName() + " WON!");
            default:
                System.out.println("DRAW");
                break;
        }
    }

    public static synchronized Battle getInstance(){
        if(battle_instance == null){
            battle_instance = new Battle();
        }
        return battle_instance;
    }
}
