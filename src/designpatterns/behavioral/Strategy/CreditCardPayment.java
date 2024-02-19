package designpatterns.behavioral.Strategy;

// Concrete implementation of a payment strategy: Credit Card
class CreditCardPayment implements PaymentStrategy {

    private String cardNumber;
    private String name;

    public CreditCardPayment(String cardNumber, String name) {
        this.cardNumber = cardNumber;
        this.name = name;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card: " + cardNumber + " (Name: " + name + ")");
    }
}
