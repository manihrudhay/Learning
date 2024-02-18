package designpatterns.creational.abstractfactory.factory;

import designpatterns.creational.abstractfactory.HouseFactory;
import designpatterns.creational.factorymethod.RoomFactory;

public class FactoryCreator{

    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("House")){
            return new HouseFactory();
        } else {
            return new RoomFactory();
        }
    }
}
