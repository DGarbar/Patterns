package Behavioral.Visitor.Example.Shapes;

import Behavioral.Visitor.Example.Visitors.Visitor;

//If we will add some new Shapes we fucked up
// bc we need add new logic to ALL Visitors

public abstract class Shape {

  protected String name;

  public Shape(String name) {
    this.name = name;
  }

  public abstract void accept(Visitor visitor);
}
