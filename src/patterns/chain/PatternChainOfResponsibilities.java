package patterns.chain;

import java.util.List;

public class PatternChainOfResponsibilities {

  public static void main(String[] args) {
    VdvChain chain = new VdvChain();

    List<Person> people = List.of(
        new Person(15, 200, 100, "Young Peter")
        , new Person(20, 120, 100, "Small Jack")
        , new Person(20, 200, 85, "Slim Andrew")
        , new Person(20, 200, 190, "Fat Daniil")
        , new Person(20, 200, 120, "Rambo")
    );

    people.forEach(chain::validate);
  }
}
