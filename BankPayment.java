
public class BankPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("Making payment using bank transfer.");
        // Do something 

        return true;
        
    }
}