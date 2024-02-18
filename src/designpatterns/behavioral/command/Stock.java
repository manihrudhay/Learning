package designpatterns.behavioral.command;

public class Stock {
    private String name;
    private int quantity;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buy() {
        System.out.println("Buying stock: " + name + ", Quantity: " + quantity);
        // Implement logic for buying stock
    }

    public void sell() {
        System.out.println("Selling stock: " + name + ", Quantity: " + quantity);
        // Implement logic for selling stock
    }
}

