package designpatterns.structural.facade;

// Subsystem 2 (DVD Player)
class DVDPlayer {
    public void on() {
        System.out.println("DVD Player is ON");
    }

    public void off() {
        System.out.println("DVD Player is OFF");
    }

    public void play(String movie) {
        System.out.println("Playing DVD: " + movie);
    }
}
