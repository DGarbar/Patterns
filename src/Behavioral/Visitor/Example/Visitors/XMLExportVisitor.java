package Behavioral.Visitor.Example.Visitors;

import Behavioral.Visitor.Example.Shapes.Circle;
import Behavioral.Visitor.Example.Shapes.Rectangle;

public class XMLExportVisitor implements Visitor {

  @Override
  public void visit(Rectangle rectangle) {
    System.out.println("Rectangle in XML LOL");
  }

  @Override
  public void visit(Circle circle) {
    System.out.println("Circle in XML OR");
  }
}
