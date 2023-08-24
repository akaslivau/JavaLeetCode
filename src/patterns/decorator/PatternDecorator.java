package patterns.decorator;

public class PatternDecorator {

  public static void main(String[] args) {
    Soup borsh = new Borsh();
    System.out.println(borsh.describe());

    Soup borshWithSourCream = new WithSourCream(borsh);
    System.out.println(borshWithSourCream.describe());

    Soup borshWithSourCreamAndParsley = new WithParsley(borshWithSourCream);
    System.out.println(borshWithSourCreamAndParsley.describe());

  }
}
