package app.factory;

import app.army.Elf;
import app.army.Enti;
import app.army.Gnome;
import app.army.Soldier;

public class SoldierBuilder implements Factory{

    // ideal ar fi sa poti alege ce soldat sa fie
    // dar nu prea am timp asa ca random it is
    public Soldier build(){
        int rng = (int)Math.floor(Math.random() * (2 - 0 + 1) + 0);
        Soldier s;
        switch (rng) {
            case 0:
                s = new Elf("Axe");
                break;
            case 1:
                s = new Gnome("Axe", 10);
                break;
            case 2:
                s = new Enti("Axe");
                break;
            default:
                s = new Elf("Axe");
                break;
        }
        return s;
    }
}
