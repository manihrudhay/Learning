package designpatterns.behavioral.Strategy;


public class StrategyMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456", "John Doe");
        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(100);


        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com");
        cart.setPaymentStrategy(payPalPayment);
        cart.checkout(50);
    }
}
