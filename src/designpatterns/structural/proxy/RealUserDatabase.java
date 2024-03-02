package designpatterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;

// Real Subject (RealUserDatabase)
class RealUserDatabase implements UserDatabase {
    private Map<String, String> userMap;

    public RealUserDatabase() {
        userMap = new HashMap<>();
        // Simulating user data in the real database
        userMap.put("john_doe", "John Doe's sensitive information");
        userMap.put("jane_smith", "Jane Smith's sensitive information");
        // Additional user data...
    }

    @Override
    public String getUserInfo(String username) {
        // Simulating fetching user information from the real database
        return userMap.getOrDefault(username, "User not found");
    }
}
