package patterns.observer;

import java.io.IOException;

public class PatternObserver {

  public static void main(String[] args) throws IOException {
    Publisher publisher = new Publisher();

    SubscriberImpl first = new SubscriberImpl("oneTv");
    SubscriberImpl second = new SubscriberImpl("ntv");

    publisher.subscribe(first);
    publisher.subscribe(second);

    publisher.doSomething("Cat's don't like dogs");

  }

}
