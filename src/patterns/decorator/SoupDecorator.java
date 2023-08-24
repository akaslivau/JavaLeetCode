package patterns.decorator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class SoupDecorator implements Soup {

  private final Soup soup;

  @Override
  public String describe() {
    return soup.describe();
  }

}