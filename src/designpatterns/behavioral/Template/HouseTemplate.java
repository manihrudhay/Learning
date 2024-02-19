package designpatterns.behavioral.Template;

abstract class HouseTemplate {

    // Template method that defines the house building algorithm
    public final void buildHouse() {
        buildFoundation();
        buildWalls();
        addWindows();
        addDoors();
        furnishHouse();
        System.out.println("House is built.");
    }

    // Abstract methods to be implemented by subclasses
    protected abstract void buildFoundation();

    protected abstract void buildWalls();

    protected abstract void addWindows();

    protected abstract void addDoors();

    protected abstract void furnishHouse();
}
