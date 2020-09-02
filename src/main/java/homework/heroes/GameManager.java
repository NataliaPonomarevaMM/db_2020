package homework.heroes;

public final class GameManager {
    public static void fight(Hero h1, Hero h2) {
        int max_iter = 100;
        h1.printStat();
        h2.printStat();

        for (int i = 0; i < max_iter && h1.isAlive() && h2.isAlive(); i++) {
            System.out.println("Iteration of fight " + i);
            System.out.println("First hero is kicking");
            h1.kick(h2);
            h1.printStat();
            h2.printStat();

            System.out.println("Second hero is kicking");
            h2.kick(h1);
            h1.printStat();
            h2.printStat();
        }
    }

    public static void main(String[] args) throws Exception {

        var h1 = HeroFactory.createHero();
        var h2 = HeroFactory.createHero();
        GameManager.fight(h1, h2);
    }
}
