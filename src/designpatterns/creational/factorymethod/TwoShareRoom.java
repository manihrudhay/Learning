package designpatterns.creational.factorymethod;

public class TwoShareRoom implements Room{

    @Override
    public int noOfBeds() {
        return 2;
    }

    @Override
    public String[] benifits() {
        return new String[] {"Geyser","Tv"};
    }
}
