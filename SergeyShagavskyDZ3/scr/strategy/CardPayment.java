package strategy;

public class CardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Оплата картой: " + amount + " руб.");
    }
}
