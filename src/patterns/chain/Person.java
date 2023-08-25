package patterns.chain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Person {

  private final int age;
  private final int height;
  private final int weight;
  private final String name;

  @Override
  public String toString() {
    return "Person{" +
        "age=" + age +
        ", height=" + height +
        ", weight=" + weight +
        ", name='" + name + '\'' +
        '}';
  }
}