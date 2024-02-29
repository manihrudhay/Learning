package designpatterns.structural.adapter;

// NewMessagingServiceClient
class NewMessagingServiceClient {
    private NewMessagingService messagingService;

    public NewMessagingServiceClient(NewMessagingService messagingService) {
        this.messagingService = messagingService;
    }

    public void communicate() {
        messagingService.sendMessage("Hello, new system!");
        messagingService.receiveMessage();
    }
}
