package patterns.visitor;

import lombok.Getter;

@Getter
public class Theater implements Building {

  private final int prima = 1230;
  private final int artists = 34;
  private final int popularGenre = 434;


  @Override
  public String accept(Visitor visitor) {
    return visitor.visitTheater(this);
  }
}
