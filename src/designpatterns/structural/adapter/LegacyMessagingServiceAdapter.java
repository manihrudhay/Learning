package designpatterns.structural.adapter;

// LegacyMessagingServiceAdapter (Adapter)
class LegacyMessagingServiceAdapter implements NewMessagingService {
    private LegacyMessagingService legacyService;

    public LegacyMessagingServiceAdapter(LegacyMessagingService legacyService) {
        this.legacyService = legacyService;
    }

    @Override
    public void sendMessage(String message) {
        // Adapt the new interface method to the old interface
        legacyService.send(message);
    }

    @Override
    public void receiveMessage() {
        // Adapt the new interface method to the old interface
        legacyService.receive();
    }
}
