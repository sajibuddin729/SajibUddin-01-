
public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setPaymentStrategy(new BankPayment());
        paymentContext.executePayment(200);

        paymentContext.setPaymentStrategy(new BkashPayment());
        paymentContext.executePayment(500);

        paymentContext.setPaymentStrategy(new CreditCardPayment());
        paymentContext.executePayment(5500);
    }
}

// here i use Strategy design pattern