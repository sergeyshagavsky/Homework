package livelock;

public class LiveLockDemo {
    private volatile boolean firstGivesWay = true;

    public void start() {

        SpaceShip ship1 = new SpaceShip("Корабль 1");
        SpaceShip ship2 = new SpaceShip("Корабль 2");

        Thread thread1 = new Thread(() -> {

            while (true) {

                if (firstGivesWay) {

                    System.out.println(ship1.getName() + ": После вас!");

                    firstGivesWay = false;

                }

                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

            }

        });

        Thread thread2 = new Thread(() -> {

            while (true) {

                if (!firstGivesWay) {

                    System.out.println(ship2.getName() + ": Нет, после вас!");

                    firstGivesWay = true;

                }

                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

            }

        });

        thread1.start();
        thread2.start();

    }

}