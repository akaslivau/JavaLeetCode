package patterns.visitor;

import lombok.Getter;

@Getter
public class SmallHouse implements Building {

  private final int people = 10;
  private final int toiletCount = 20;

  @Override
  public String accept(Visitor visitor) {
    return visitor.visitSmallHouse(this);
  }
}
