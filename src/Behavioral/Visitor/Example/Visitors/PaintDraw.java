package Behavioral.Visitor.Example.Visitors;

import Behavioral.Visitor.Example.Shapes.Circle;
import Behavioral.Visitor.Example.Shapes.Rectangle;

public class PaintDraw implements Visitor {

  @Override
  public void visit(Rectangle rectangle) {
    System.out.println("Rectangle in Paint");
    rectangle.rotate();
  }

  @Override
  public void visit(Circle circle) {
    System.out.println("Circle in Paint");
    circle.expand();
  }
}
