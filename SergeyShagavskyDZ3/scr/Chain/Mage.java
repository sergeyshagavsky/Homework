package Chain;

public class Mage extends Hero {

    @Override
    public void attack(int bossHealth) {

        System.out.println("Маг наносит 50 урона.");

        bossHealth -= 50;

        if (bossHealth > 0) {
            System.out.println("Босс выжил. Осталось здоровья: " + bossHealth);
        } else {
            System.out.println("Босс побежден!");
        }

    }

}
