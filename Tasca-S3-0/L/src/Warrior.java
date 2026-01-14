public class Warrior extends Character {
    public Warrior(Damage damageBehavior) {
        super(damageBehavior);
    }
    @Override
    public void attack() {
        System.out.println("The warrior strikes with a sword.");
    }
}
