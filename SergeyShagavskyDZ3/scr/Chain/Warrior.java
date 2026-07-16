package Chain;

public class Warrior extends Hero {

    @Override
    public void attack(int bossHealth) {

        System.out.println("Воин наносит 40 урона.");

        bossHealth -= 40;

        if (bossHealth > 0 && nextHero != null) {
            nextHero.attack(bossHealth);
        } else {
            System.out.println("Босс побежден!");
        }

    }

}