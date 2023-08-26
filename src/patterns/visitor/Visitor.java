package patterns.visitor;

public interface Visitor {
    String visitShaurma(Shaurma shaurma);

    String visitSmallHouse(SmallHouse smallHouse);

    String visitStadium(Stadium stadium);

    String visitTheater(Theater theater);
}