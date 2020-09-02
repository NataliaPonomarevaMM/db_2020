package homework.heroes;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Hero {
    private String name;
    private int power;
    private int hp;

    public Hero(String name) {
        this.name = name;
    }
    public abstract void kick(Hero h);
    public boolean isAlive() {
        return hp > 0;
    }
    public final void printStat() {
        System.out.println(name + " is " + hp + " hp and " + power + " power");
    }
}
