package designpatterns.behavioral.Template;

public class TemplateMain {
    public static void main(String[] args) {
        System.out.println("Building a Wooden House:");
        HouseTemplate woodenHouse = new WoodenHouse();
        woodenHouse.buildHouse();

        System.out.println("\nBuilding a Concrete House:");
        HouseTemplate concreteHouse = new ConcreteHouse();
        concreteHouse.buildHouse();
    }
}
