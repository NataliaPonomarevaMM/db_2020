package homework.heroes;

public class Elf extends Hero {
    public Elf(String name) {
        super(name);
        setPower(10);
        setHp(10);
    }

    @Override
    public void kick(Hero h) {
        if (h.getPower() < this.getPower())
            h.setHp(0);
        else
            h.setPower(h.getPower() - 1);
    }
}
