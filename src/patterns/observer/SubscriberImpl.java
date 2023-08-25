package patterns.observer;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class SubscriberImpl implements ISubscriber {

  private final String name;
  private String actualData;

  @Override
  public void onNext(String data) {
    setActualData(data);
    System.out.println(this.name + " called onNext with: " + data);
  }

}