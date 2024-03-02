package designpatterns.structural.facade;

// Subsystem 1 (Projector)
class Projector {
    public void on() {
        System.out.println("Projector is ON");
    }

    public void off() {
        System.out.println("Projector is OFF");
    }

    public void setInput(String input) {
        System.out.println("Setting projector input to: " + input);
    }
}
