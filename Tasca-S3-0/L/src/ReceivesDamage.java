public class ReceivesDamage implements Damage {
    @Override
    public void takeDamage(int points) {
        System.out.println("Character takes " + points + " points of damage.");
    }
}