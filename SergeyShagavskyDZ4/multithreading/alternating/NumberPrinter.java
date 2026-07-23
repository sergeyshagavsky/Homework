package alternating;

public class NumberPrinter {
    private boolean firstTurn = true;

    public synchronized void printOne() {

        while (!firstTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("1");

        firstTurn = false;

        notify();

    }

    public synchronized void printTwo() {

        while (firstTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("2");

        firstTurn = true;

        notify();

    }

}
