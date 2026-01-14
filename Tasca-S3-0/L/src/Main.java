public class Main {
    public static void main(String[] args) {

        Damage receivesDamage = new ReceivesDamage();
        Damage noDamage = new NoReceivesDamage();

        Character warrior = new Warrior(receivesDamage);
        Character ghost = new Ghost(noDamage);


        warrior.attack();
        warrior.takeDamage(20);

        ghost.attack();
        ghost.takeDamage(20);
    }
}
