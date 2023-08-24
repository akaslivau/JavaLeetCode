package patterns.observer;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class NewsChannel implements Channel {

  private final String name;
  private String lastNews;

  @Override
  public void update(String news) {
    setLastNews(news);
    System.out.println(this.name + " published last news: " + news);
  }

}