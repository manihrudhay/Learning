package designpatterns.structural.facade;

// Example Usage
public class FacadeMain {
    public static void main(String[] args) {
        // Creating subsystem components
        Projector projector = new Projector();
        DVDPlayer dvdPlayer = new DVDPlayer();
        SoundSystem soundSystem = new SoundSystem();

        // Creating the facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(projector, dvdPlayer, soundSystem);

        // Watching a movie using the facade
        homeTheater.watchMovie("Inception");

        System.out.println();

        // Ending the movie using the facade
        homeTheater.endMovie();
    }
}

