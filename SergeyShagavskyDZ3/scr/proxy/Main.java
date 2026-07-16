package proxy;

public class Main {

    public static void main(String[] args) {

        Database database1 = new DatabaseProxy(true);
        database1.showData();

        System.out.println();

        Database database2 = new DatabaseProxy(false);
        database2.showData();

    }

}