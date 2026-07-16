package proxy;

public class RealDatabase implements Database {

    @Override
    public void showData() {
        System.out.println("Секретные данные из базы данных.");
    }

}