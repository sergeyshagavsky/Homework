package Chain;

public class Archer extends Hero {

    @Override
    public void attack(int bossHealth) {

        System.out.println("Лучник наносит 30 урона.");

        bossHealth -= 30;

        if (bossHealth > 0 && nextHero != null) {
            nextHero.attack(bossHealth);
        } else {
            System.out.println("Босс побежден!");
        }

    }

}