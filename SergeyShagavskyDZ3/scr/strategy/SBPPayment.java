package strategy;

public class SBPPayment implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("Оплата через СБП: " + amount + " руб.");
    }
}
