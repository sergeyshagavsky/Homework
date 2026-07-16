package Chain;

public abstract class Hero {

    protected Hero nextHero;

    public void setNextHero(Hero nextHero) {
        this.nextHero = nextHero;
    }

    public abstract void attack(int bossHealth);

}