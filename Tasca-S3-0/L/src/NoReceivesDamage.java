public class NoReceivesDamage implements Damage {
    @Override
    public void takeDamage(int points) {
        System.out.println("This character cannot take damage!");
    }
}