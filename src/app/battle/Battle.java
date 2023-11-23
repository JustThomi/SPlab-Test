package app.battle;

public class Battle {
    private static Battle battle;

    private Battle(){
        
    }

    public Battle getInstance(){
        return battle;
    }
}
