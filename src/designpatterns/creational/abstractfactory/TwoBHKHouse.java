package designpatterns.creational.abstractfactory;

public class TwoBHKHouse implements House{
    @Override
    public String type() {
        return "Two BedRoom House";
    }

    @Override
    public int noOfRooms() {
        return 4;
    }
}
