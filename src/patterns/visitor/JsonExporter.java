package patterns.visitor;


import java.util.Collection;

public class JsonExporter implements Visitor {

  @Override
  public String visitShaurma(Shaurma o) {
    return o.getSize() + "::"
        + o.getClassicPrice()  + "::"
        + o.getHachikCount();
  }

  @Override
  public String visitSmallHouse(SmallHouse o) {
    return o.getPeople() + "::"
        + o.getToiletCount();
  }

  @Override
  public String visitStadium(Stadium o) {
    return o.getAddress() + "::"
        + o.getFieldSize();
  }

  @Override
  public String visitTheater(Theater o) {
    return o.getPrima() + "::"
        + o.getArtists()  + "::"
        + o.getPopularGenre();
  }

  public String convert(Collection<Building> args) {
    StringBuilder sb = new StringBuilder();
    sb.append("[");
    for (Building item : args) {
      sb.append(item.accept(this)).append(", \n");
    }
    sb.append("]");

    return sb.toString();
  }


}