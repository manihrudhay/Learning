package designpatterns.behavioral.command.order;

import designpatterns.behavioral.command.Stock;

public class BuyStockOrder implements Order {
    private Stock stock;

    public BuyStockOrder(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}