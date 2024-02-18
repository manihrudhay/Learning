package designpatterns.creational.abstractfactory;

public class OneBHKHouse implements House{
    @Override
    public String type() {
        return "Single BedRoom";
    }

    @Override
    public int noOfRooms() {
        return 3;
    }
}
