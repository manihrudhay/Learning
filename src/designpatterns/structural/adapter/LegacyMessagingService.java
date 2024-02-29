package designpatterns.structural.adapter;

// Legacy Messaging Service (existing interface)
interface LegacyMessagingService {
    void send(String message);

    void receive();
}
