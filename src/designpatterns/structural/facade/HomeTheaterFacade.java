package designpatterns.structural.facade;

// Facade
class HomeTheaterFacade {
    private Projector projector;
    private DVDPlayer dvdPlayer;
    private SoundSystem soundSystem;

    public HomeTheaterFacade(Projector projector, DVDPlayer dvdPlayer, SoundSystem soundSystem) {
        this.projector = projector;
        this.dvdPlayer = dvdPlayer;
        this.soundSystem = soundSystem;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        projector.on();
        projector.setInput("DVD");
        dvdPlayer.on();
        dvdPlayer.play(movie);
        soundSystem.on();
        soundSystem.setVolume(10);
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        projector.off();
        dvdPlayer.off();
        soundSystem.off();
    }
}
