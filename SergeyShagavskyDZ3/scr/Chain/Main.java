package Chain;

public class Main {

    public static void main(String[] args) {

        Hero warrior = new Warrior();
        Hero archer = new Archer();
        Hero mage = new Mage();

        warrior.setNextHero(archer);
        archer.setNextHero(mage);

        warrior.attack(100);

    }

}