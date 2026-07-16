package proxy;

public class DatabaseProxy implements Database {

    private final RealDatabase realDatabase;
    private final boolean hasAccess;

    public DatabaseProxy(boolean hasAccess) {
        this.realDatabase = new RealDatabase();
        this.hasAccess = hasAccess;
    }

    @Override
    public void showData() {

        if (hasAccess) {
            System.out.println("Доступ разрешен.");
            realDatabase.showData();
        } else {
            System.out.println("Ошибка! Доступ запрещен.");
        }

    }

}