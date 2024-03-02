package designpatterns.structural.facade;

// Subsystem 3 (Sound System)
class SoundSystem {
    public void on() {
        System.out.println("Sound System is ON");
    }

    public void off() {
        System.out.println("Sound System is OFF");
    }

    public void setVolume(int volume) {
        System.out.println("Setting volume to: " + volume);
    }
}
