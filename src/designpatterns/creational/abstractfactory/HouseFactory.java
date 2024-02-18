package designpatterns.creational.abstractfactory;

import designpatterns.creational.abstractfactory.factory.AbstractFactory;
import designpatterns.creational.factorymethod.Room;

public class HouseFactory extends AbstractFactory {

    public static House getInstance(String type) {

        switch (type) {
            case "OneBHK":
                return new OneBHKHouse();
            case "TwoBHK":
                return new TwoBHKHouse();
            default: return new TwoBHKHouse();
        }
    }

    @Override
    public House getHouse(String factory) {
        switch (factory) {
            case "OneBHK":
                return new OneBHKHouse();
            case "TwoBHK":
                return new TwoBHKHouse();
            default:
                return new OneBHKHouse();
        }
    }

    @Override
    public Room getRoom(String factory) {
        return null;
    }
}
