package designpatterns.behavioral.command.order;

import designpatterns.behavioral.command.Stock;

public class SellStockOrder implements Order {
    private Stock stock;

    public SellStockOrder(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}