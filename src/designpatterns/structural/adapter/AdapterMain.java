package designpatterns.structural.adapter;

// Example Usage
public class AdapterMain {
    public static void main(String[] args) {
        // Using the new messaging service with the client
        NewMessagingService newMessagingService = new NewMessagingServiceImpl();
        NewMessagingServiceClient newClient = new NewMessagingServiceClient(newMessagingService);
        newClient.communicate();

        System.out.println();

        // Using the legacy messaging service with the client through the adapter
        LegacyMessagingService legacyMessagingService = new LegacyMessagingServiceImpl();
        LegacyMessagingServiceAdapter adapter = new LegacyMessagingServiceAdapter(legacyMessagingService);
        NewMessagingServiceClient legacyClient = new NewMessagingServiceClient(adapter);
        legacyClient.communicate();
    }
}

