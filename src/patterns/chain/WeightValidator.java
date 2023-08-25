package patterns.chain;

public class WeightValidator implements ValidationChain {

  @Override
  public boolean validate(Person person) {
    if (person.getWeight() < 90 || person.getWeight() > 130) {
      System.out.println("Wrong weight: " + person);
      return false;
    }
    return true;
  }

}