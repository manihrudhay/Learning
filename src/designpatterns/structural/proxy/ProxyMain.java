package designpatterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;

// Client
public class ProxyMain {
    public static void main(String[] args) {
        // Using the proxy to access user information
        UserDatabase userDatabase = new UserProxy();

        // First request (fetches and caches user information)
        System.out.println(userDatabase.getUserInfo("john_doe"));

        // Second request (returns cached user information)
        System.out.println(userDatabase.getUserInfo("john_doe"));

        // Request for a non-existing user (returns default message)
        System.out.println(userDatabase.getUserInfo("non_existing_user"));
    }
}
