package designpatterns.creational.factorymethod;

import designpatterns.creational.abstractfactory.factory.AbstractFactory;
import designpatterns.creational.abstractfactory.House;

public class RoomFactory extends AbstractFactory {
    public static Room getInstance(String type) {

        switch (type) {
            case "Single":
                return new SingleShareRoom();
            case "Double":
                return new TwoShareRoom();
            default: return new TwoShareRoom();
        }
    }

    @Override
    public House getHouse(String factory) {
        return null;
    }

    @Override
    public Room getRoom(String factory) {
        switch (factory) {
            case "Single":
                return new SingleShareRoom();
            case "Double":
                return new TwoShareRoom();
            default:
                return new TwoShareRoom();
        }
    }
}
