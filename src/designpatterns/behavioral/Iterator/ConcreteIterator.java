package designpatterns.behavioral.Iterator;

import java.util.List;

class ConcreteIterator implements Iterator<Integer> {
    private List<Integer> items;
    private int position;

    public ConcreteIterator(List<Integer> items) {
        this.items = items;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public Integer next() {
        if (this.hasNext()) {
            return items.get(position++);
        }
        return null;
    }
}

