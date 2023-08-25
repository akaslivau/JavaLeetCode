package patterns.chain;

public class AgeValidator implements ValidationChain {

  @Override
  public boolean validate(Person person) {
    if (person.getAge() > 50 || person.getAge() < 18) {
      System.out.println("Wrong age: " + person);
      return false;
    }
    return true;
  }

}