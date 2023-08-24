package patterns.decorator;

public class WithSourCream extends SoupDecorator {

  public WithSourCream(Soup soup) {
    super(soup);
  }

  @Override
  public String describe() {
    return super.describe() + addSourCream();
  }

  private String addSourCream() {
    return "And adding some sour cream...";
  }
}