package designpatterns.structural;

// Concrete implementation of NewMessagingService
class NewMessagingServiceImpl implements NewMessagingService {
    @Override
    public void sendMessage(String message) {
        System.out.println("New Messaging Service: Sending message - " + message);
    }

    @Override
    public void receiveMessage() {
        System.out.println("New Messaging Service: Receiving message");
    }
}
