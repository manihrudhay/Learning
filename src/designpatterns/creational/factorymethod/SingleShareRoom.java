package designpatterns.creational.factorymethod;

public class SingleShareRoom implements Room{


    @Override
    public int noOfBeds() {
        return 1;
    }

    @Override
    public String[] benifits() {
        return new String[] {"TV","table","Geyser","Washing Machine"};
    }
}
