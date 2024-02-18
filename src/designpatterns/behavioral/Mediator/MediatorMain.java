package designpatterns.behavioral.Mediator;

public class MediatorMain {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User user1 = new User(chatRoom, "User1");
        User user2 = new User(chatRoom, "User2");
        User user3 = new User(chatRoom, "User3");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.sendMessage("Hello, everyone!");
        user2.sendMessage("Hi there!");
    }
}
