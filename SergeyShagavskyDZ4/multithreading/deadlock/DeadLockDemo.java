package deadlock;

public class DeadLockDemo {
    private final Object sword = new Object();
    private final Object shield = new Object();

    public void startBattle() {

        Thread knight1 = new Thread(() -> {

            synchronized (sword) {

                System.out.println("Рыцарь 1 взял меч.");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                System.out.println("Рыцарь 1 ждет щит...");

                synchronized (shield) {
                    System.out.println("Рыцарь 1 начал бой.");
                }

            }

        });

        Thread knight2 = new Thread(() -> {

            synchronized (shield) {

                System.out.println("Рыцарь 2 взял щит.");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                System.out.println("Рыцарь 2 ждет меч...");

                synchronized (sword) {
                    System.out.println("Рыцарь 2 начал бой.");
                }

            }

        });

        knight1.start();
        knight2.start();

    }

}
