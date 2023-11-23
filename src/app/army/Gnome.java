package app.army;

public class Gnome extends Soldier implements Spells{
    private int armore;

    public Gnome(String weapon, int armore) {
        super(weapon);
        this.armore = armore;
    }

    @Override
    public String toString() {
        return "Gnome: Weapon:" + this.getWeapon() + ", Armore: " + this.armore;
    }

    @Override
    public void shootArrow() {
        System.out.println("ARROW SHOT");
    }

    @Override
    public void fireball() {
        System.out.println("FIREBALL CAST");
    }

    @Override
    public void healParty() {
        System.out.println("HEALING");
    }

    @Override
    public void swingSword() {
        System.out.println("SWORD BAM BAM");
    }
}
