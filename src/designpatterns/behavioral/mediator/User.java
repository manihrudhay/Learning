package designpatterns.behavioral.mediator;

class User {
    private ChatMediator mediator;
    private String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public void sendMessage(String message) {
        System.out.println(name + " sends message: " + message);
        mediator.sendMessage(message, this);
    }

    public void receiveMessage(String message) {
        System.out.println(name + " received message: " + message);
    }
}

