package designpatterns.behavioral.Iterator;

import java.util.ArrayList;
import java.util.List;

class ConcreteCollection implements IterableCollection {
    private List<Integer> items;

    public ConcreteCollection() {
        this.items = new ArrayList<>();
    }

    public void addItem(int item) {
        items.add(item);
    }

    @Override
    public Iterator<Integer> createIterator() {
        return new ConcreteIterator(items);
    }
}
