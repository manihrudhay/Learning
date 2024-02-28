package designpatterns.structural;

// New Messaging Service (new interface)
interface NewMessagingService {
    void sendMessage(String message);

    void receiveMessage();
}
