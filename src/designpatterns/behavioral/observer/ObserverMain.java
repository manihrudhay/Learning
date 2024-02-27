package designpatterns.behavioral.observer;

public class ObserverMain {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        // Subscribers
        Subscriber emailSubscriber = new EmailSubscriber("john@example.com");
        Subscriber smsSubscriber = new SMSSubscriber("+1234567890");

        // Adding subscribers to the news agency
        newsAgency.addSubscriber(emailSubscriber);
        newsAgency.addSubscriber(smsSubscriber);

        // Publishing news
        newsAgency.publishNews("Breaking News: Important Event!");

        // Removing email subscriber
        newsAgency.removeSubscriber(emailSubscriber);

        // Publishing another news
        newsAgency.publishNews("Latest Updates: Technology Advancements!");
    }
}

