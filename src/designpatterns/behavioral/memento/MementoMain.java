package designpatterns.behavioral.memento;

// Example Usage
public class MementoMain {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("State 1");
        caretaker.addMemento(originator.saveStateToMemento());
        originator.setState("State 2");
        System.out.println("Current State: " + originator.getState());
        originator.restoreStateFromMemento(caretaker.getMemento(0));
        caretaker.addMemento(originator.saveStateToMemento());
        System.out.println("Current State: " + originator.getState());
        originator.restoreStateFromMemento(caretaker.getMemento(0));
        System.out.println("Current State: " + originator.getState());
    }
}
