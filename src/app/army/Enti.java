package app.army;

public class Enti extends Soldier implements Spells{
    
    public Enti( String weapon) {
        super(weapon);
    }

    @Override
    public String toString() {
        return "Enti: Weapon:" + this.getWeapon();
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
