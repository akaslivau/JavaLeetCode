package patterns.visitor;

public interface Building {

    String accept(Visitor visitor);
}