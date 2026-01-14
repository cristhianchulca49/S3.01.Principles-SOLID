public class Character {
    private Damage damageBehavior;

    public Character(Damage damageBehavior) {
        this.damageBehavior = damageBehavior;
    }

    public void attack() {
        System.out.println("The character attacks with a weapon.");
    }

    public void takeDamage(int points) {
        damageBehavior.takeDamage(points);
    }

    public void setDamageBehavior(Damage damageBehavior) {
        this.damageBehavior = damageBehavior;
    }
}
