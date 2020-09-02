package homework.heroes;

public class Hobbit extends Hero{
    public Hobbit(String name) {
        super(name);
        setName(name);
        setPower(0);
        setHp(3);
    }

    private void toCry() {
        System.out.println(getName() + " is crying");
    }

    @Override
    public void kick(Hero h) {
        toCry();
    }
}
