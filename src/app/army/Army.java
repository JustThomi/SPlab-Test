package app.army;

import java.util.ArrayList;

public class Army {
    private ArrayList<Batalion> batalions;

    public Army(){
        this.batalions = new ArrayList<>();
        buildArmy();
    }

    public void buildArmy(){
        for (int i = 0; i < 10; i++) {
            Batalion b = new Batalion();
            batalions.add(b);
        }
    }

    @Override
    public String toString() {
        return "Army [batalions: \n" + batalions + "]";
    }
}
