package alternating;

public class Main {
    public static void main(String[] args) {

        NumberPrinter printer = new NumberPrinter();

        Thread thread1 = new Thread(() -> {

            while (true) {
                printer.printOne();
            }

        });

        Thread thread2 = new Thread(() -> {

            while (true) {
                printer.printTwo();
            }

        });

        thread1.start();
        thread2.start();

    }

}
