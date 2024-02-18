package designpatterns.behavioral.Iterator;

interface IterableCollection {
    Iterator<Integer> createIterator();
}