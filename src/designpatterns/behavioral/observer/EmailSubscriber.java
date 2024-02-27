package designpatterns.behavioral.observer;

// Concrete Observer 1: EmailSubscriber
class EmailSubscriber implements Subscriber {
    private String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String news) {
        System.out.println("Sending email to " + email + ": " + news);
    }
}
