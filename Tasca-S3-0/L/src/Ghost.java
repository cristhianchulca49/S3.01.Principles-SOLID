public class Ghost extends Character {
    public Ghost(Damage damageBehavior) {
        super(damageBehavior);
    }

    @Override
    public void attack() {
        System.out.println("The ghost casts a spooky spell.");
    }
}
