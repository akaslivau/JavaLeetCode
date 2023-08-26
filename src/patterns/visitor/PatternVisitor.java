package patterns.visitor;

import java.util.List;

public class PatternVisitor {

  public static void main(String[] args) {

    List<Building> buildings = List.of(
        new Shaurma(),
        new Shaurma(),
        new Stadium(),
        new SmallHouse(),
        new SmallHouse(),
        new SmallHouse(),
        new Theater()
    );

    JsonExporter jsonExporter = new JsonExporter();
    //Допустим, нужен будет другой формат -- пишешь другого визитора и всю логику пихаешь в него

    String json = jsonExporter.convert(buildings);
    System.out.println(json);
  }

}
