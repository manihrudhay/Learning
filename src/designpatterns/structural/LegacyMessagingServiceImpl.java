package designpatterns.structural;

// Concrete implementation of LegacyMessagingService
class LegacyMessagingServiceImpl implements LegacyMessagingService {
    @Override
    public void send(String message) {
        System.out.println("Legacy Messaging Service: Sending message - " + message);
    }

    @Override
    public void receive() {
        System.out.println("Legacy Messaging Service: Receiving message");
    }
}
