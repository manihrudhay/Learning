package designpatterns.behavioral.Template;

class WoodenHouse extends HouseTemplate {

    @Override
    protected void buildFoundation() {
        System.out.println("Building wooden foundation");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Building wooden walls");
    }

    @Override
    protected void addWindows() {
        System.out.println("Adding wooden windows");
    }

    @Override
    protected void addDoors() {
        System.out.println("Adding wooden doors");
    }

    @Override
    protected void furnishHouse() {
        System.out.println("Furnishing with wooden furniture");
    }
}
