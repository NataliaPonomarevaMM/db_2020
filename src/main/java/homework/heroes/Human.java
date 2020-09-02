package homework.heroes;

public abstract class Human extends Hero {

    public Human(String name, int min, int max) {
        super(name);
        setHp(getRandomNumber(min, max));
        setPower(getRandomNumber(min, max));
    }

    @Override
    public final void kick(Hero h) {
        h.setHp(getRandomNumber(0, this.getPower()));
    }

    private int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
