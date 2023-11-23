package app.army;

import java.util.ArrayList;

import app.factory.SoldierBuilder;

public class Batalion {
    private ArrayList<Soldier> soldiers;
    public int numberOfSpecies;

    public Batalion(){
        this.soldiers = new ArrayList<>();
        buildBatalion();
        this.numberOfSpecies = checkNrOfSpecies();
    }

    // not the best aproach, will do for now
    public int checkNrOfSpecies(){
        Boolean hasElf = false;
        Boolean hasGnome = false;
        Boolean hasEnti = false;
        int nr = 0;

        for (Soldier soldier : soldiers) {
            if(soldier instanceof Elf && !hasElf){
                hasElf = true;
                nr += 1;
            }            
            if(soldier instanceof Gnome && !hasGnome){
                hasGnome = true;
                nr += 1;

            }            
            if(soldier instanceof Enti && !hasEnti){
                hasEnti = true;
                nr += 1;
            }
        }
        return nr;
    }

    public void buildBatalion(){
        SoldierBuilder builder = new SoldierBuilder();
        for (int i = 0; i < 10; i++) {
            Soldier s = builder.build();
            this.soldiers.add(s);
        }
    }

    @Override
    public String toString() {
        return "Batalion [soldiers:\n" + soldiers + "\n numberOfSpecies=" + numberOfSpecies + "]\n\n";
    }
}
