package patterns.observer;

import java.io.IOException;

public class PatternObserver {

  public static void main(String[] args) throws IOException {
    NewsAgency observable = new NewsAgency();

    NewsChannel oneTv = new NewsChannel("oneTv");
    NewsChannel ntv = new NewsChannel("ntv");

    observable.addObserver(oneTv);
    observable.addObserver(ntv);

    observable.setNews("Cat's don't like dogs");

  }

}
