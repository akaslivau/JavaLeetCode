package patterns.visitor;

import lombok.Getter;

@Getter
public class Stadium implements Building{

  private final int fieldSize = 30;
  private final int address = 40;



  @Override
  public String accept(Visitor visitor) {
    return visitor.visitStadium(this);
  }
}
