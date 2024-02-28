package designpatterns.structural;

// LegacyMessagingServiceClient
class LegacyMessagingServiceClient {
    private LegacyMessagingService legacyService;

    public LegacyMessagingServiceClient(LegacyMessagingService legacyService) {
        this.legacyService = legacyService;
    }

    public void communicate() {
        legacyService.send("Hello, legacy system!");
        legacyService.receive();
    }
}
