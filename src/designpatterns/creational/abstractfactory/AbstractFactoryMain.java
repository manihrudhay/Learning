package designpatterns.creational.abstractfactory;

import designpatterns.creational.abstractfactory.factory.AbstractFactory;
import designpatterns.creational.abstractfactory.factory.FactoryCreator;
import designpatterns.creational.factorymethod.Room;

public class AbstractFactoryMain  {
    public static void main(String[] args) {
        AbstractFactory houseFactory = FactoryCreator.getFactory("House");
        AbstractFactory roomFactory = FactoryCreator.getFactory("Room");
        House house = houseFactory.getHouse("OneBHK");
        Room room =  roomFactory.getRoom("TwoShare");
        System.out.println("No of Rooms in House: "+house.noOfRooms());
        System.out.println("No of beds in Room: "+room.noOfBeds());
    }
}
