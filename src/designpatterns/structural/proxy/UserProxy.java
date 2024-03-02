package designpatterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;

// Proxy (UserProxy)
class UserProxy implements UserDatabase {
    private RealUserDatabase realUserDatabase;
    private Map<String, String> cachedUserInfo;

    public UserProxy() {
        this.realUserDatabase = new RealUserDatabase();
        this.cachedUserInfo = new HashMap<>();
    }

    @Override
    public String getUserInfo(String username) {
        // Check if user information is already cached
        if (cachedUserInfo.containsKey(username)) {
            System.out.println("Proxy: Returning cached user information for " + username);
            return cachedUserInfo.get(username);
        }

        // Fetch user information from the real database
        String userInfo = realUserDatabase.getUserInfo(username);

        // Cache the user information
        cachedUserInfo.put(username, userInfo);

        System.out.println("Proxy: Fetched and cached user information for " + username);

        return userInfo;
    }
}
