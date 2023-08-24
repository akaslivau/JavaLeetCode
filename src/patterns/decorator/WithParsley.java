package patterns.decorator;

public class WithParsley extends SoupDecorator {

  public WithParsley(Soup soup) {
    super(soup);
  }

  @Override
  public String describe() {
    return super.describe() + addParsley();
  }

  private String addParsley() {
    return "And adding some parsley...";
  }
}