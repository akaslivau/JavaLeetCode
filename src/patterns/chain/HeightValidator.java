package patterns.chain;

public class HeightValidator implements ValidationChain {

  @Override
  public boolean validate(Person person) {
    if (person.getHeight() < 190) {
      System.out.println("Wrong height: " + person);
      return false;
    }
    return true;
  }

}