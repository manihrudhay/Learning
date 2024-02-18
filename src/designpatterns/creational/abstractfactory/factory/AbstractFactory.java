package designpatterns.creational.abstractfactory.factory;

import designpatterns.creational.abstractfactory.House;
import designpatterns.creational.factorymethod.Room;

public abstract class AbstractFactory {
    public abstract House getHouse(String factory);
    public abstract Room getRoom(String factory);
}
