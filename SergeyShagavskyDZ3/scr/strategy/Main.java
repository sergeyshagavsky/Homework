package strategy;

public class Main {

    public static void main(String[] args) {

        PaymentService paymentService;

        paymentService = new PaymentService(new CardPayment());
        paymentService.pay(5000);

        paymentService = new PaymentService(new CashPayment());
        paymentService.pay(3000);

        paymentService = new PaymentService(new SBPPayment());
        paymentService.pay(7000);
    }
}
