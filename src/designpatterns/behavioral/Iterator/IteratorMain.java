package designpatterns.behavioral.Iterator;

public class IteratorMain {
    public static void main(String[] args) {
        ConcreteCollection collection = new ConcreteCollection();
        collection.addItem(1);
        collection.addItem(2);
        collection.addItem(3);

        Iterator<Integer> iterator = collection.createIterator();

        while (iterator.hasNext()) {
            Integer item = iterator.next();
            System.out.println("Element: " + item);
        }
    }
}
