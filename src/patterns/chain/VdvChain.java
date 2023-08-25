package patterns.chain;

import java.util.LinkedList;
import java.util.List;

public class VdvChain {

  private final List<ValidationChain> validations;

  public VdvChain() {
    validations = new LinkedList<>(
        List.of(
            new AgeValidator(),
            new HeightValidator(),
            new WeightValidator()
        )
    );
  }

  public boolean validate(Person p) {
    for (ValidationChain validation : validations) {
      boolean result = validation.validate(p);
      if (!result) {
        return false;
      }
    }
    System.out.println("Your are in army! " + p);
    return true;
  }
}