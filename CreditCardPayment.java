
public class CreditCardPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("Making payment using credit card.");
        // Do something specific
        return true;
    }
}





