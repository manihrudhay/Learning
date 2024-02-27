package designpatterns.behavioral.template;

class ConcreteHouse extends HouseTemplate {

    @Override
    protected void buildFoundation() {
        System.out.println("Building concrete foundation");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Building concrete walls");
    }

    @Override
    protected void addWindows() {
        System.out.println("Adding glass windows");
    }

    @Override
    protected void addDoors() {
        System.out.println("Adding steel doors");
    }

    @Override
    protected void furnishHouse() {
        System.out.println("Furnishing with modern furniture");
    }
}
