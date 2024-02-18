package designpatterns.behavioral.command;

import designpatterns.behavioral.command.order.BuyStockOrder;
import designpatterns.behavioral.command.order.SellStockOrder;

public class Client {
    public static void main(String[] args) {
        Stock appleStock = new Stock("Paytm", 10);

        BuyStockOrder buyOrder = new BuyStockOrder(appleStock);
        SellStockOrder sellOrder = new SellStockOrder(appleStock);

        Broker broker = new Broker();

        broker.placeOrder(buyOrder);
        broker.placeOrder(sellOrder);
    }
}
