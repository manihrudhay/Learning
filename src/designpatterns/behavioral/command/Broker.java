package designpatterns.behavioral.command;

import designpatterns.behavioral.command.order.Order;

class Broker {
    private Order order;

    public void placeOrder(Order order) {
        this.order = order;
        this.order.execute();
    }
}