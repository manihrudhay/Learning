package designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// Example Usage
public class FlyWeightMain {
    public static void main(String[] args) {
        CharFlyweightFactory flyweightFactory = new CharFlyweightFactory();
        TextEditor textEditor = new TextEditor(flyweightFactory, "Hello Flyweight!");

        // Printing text using shared flyweights
        textEditor.printText();
    }
}

