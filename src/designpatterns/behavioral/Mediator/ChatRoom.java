package designpatterns.behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

// Concrete Mediator
class ChatRoom implements ChatMediator {
    private List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            // Broadcasting the message to all users except the sender
            if (u != user) {
                u.receiveMessage(message);
            }
        }
    }
}
