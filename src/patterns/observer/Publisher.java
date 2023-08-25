package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {

  private String someData;
  private List<ISubscriber> subscribers = new ArrayList<>();

  public void subscribe(ISubscriber subsriber) {
    this.subscribers.add(subsriber);
  }

  public void doSomething(String someData) {
    this.someData = someData;
    for (ISubscriber subscriber : this.subscribers) {
      subscriber.onNext(this.someData);
    }
  }
}