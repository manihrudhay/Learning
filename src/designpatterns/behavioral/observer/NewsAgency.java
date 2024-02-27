package designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

// Subject: NewsAgency
class NewsAgency {
    private String news;
    private List<Subscriber> subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void publishNews(String news) {
        this.news = news;
        notifySubscribers();
    }

    private void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }
}
