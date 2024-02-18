package designpatterns.creational.prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        Mani mani = new Mani("Mani",23);
        Mani clone = mani.clone();
        System.out.println("Actual instance hashcode: "+mani.hashCode());
        System.out.println("Cloned instance hashcode: "+clone.hashCode());
        System.out.println("Actual instance values: "+mani.name+" "+mani.age);
        System.out.println("Cloned instance values: "+clone.name+" "+clone.age);
    }
}
