package patterns.visitor;

import lombok.Getter;

@Getter
public class Shaurma implements Building{

  private final int size = 10;
  private final int classicPrice = 20;
  private final int hachikCount = 30;

  @Override
  public String accept(Visitor visitor) {
    return visitor.visitShaurma(this);
  }
}
