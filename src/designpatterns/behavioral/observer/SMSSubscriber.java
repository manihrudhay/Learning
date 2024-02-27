package designpatterns.behavioral.observer;

// Concrete Observer 2: SMSSubscriber
class SMSSubscriber implements Subscriber {
    private String phoneNumber;

    public SMSSubscriber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String news) {
        System.out.println("Sending SMS to " + phoneNumber + ": " + news);
    }
}
