
public class BankPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("Making payment using bank transfer.");
        // Do something specific to bank payment
        return true;
    }
}