package homework.heroes;

public final class HeroFactory {
    private static int numberOfInstances = 0;

    public static Hero createHero() throws Exception {
        String[] names = {"Elf", "Hobbit", "King", "Knight"};
        int id = (int) (Math.random() * names.length);
        Class<? extends Hero> h = Class.forName("homework.heroes." + names[id]).asSubclass(Hero.class);
        return h.getConstructor(String.class).newInstance( names[id] + numberOfInstances++);
    }
}
