package Behavioral.Visitor.Example.Shapes;

import Behavioral.Visitor.Example.Visitors.Visitor;

public class Circle extends Shape {

  private int r;

  public Circle(String name, int r) {
    super(name);
    this.r = r;
  }

  public void expand() {
    System.out.println("Expanding.. NAME: " + name);
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
