package Behavioral.Visitor.Example;

import Behavioral.Visitor.Example.Shapes.Circle;
import Behavioral.Visitor.Example.Shapes.Rectangle;
import Behavioral.Visitor.Example.Shapes.Shape;
import Behavioral.Visitor.Example.Visitors.PaintDraw;
import Behavioral.Visitor.Example.Visitors.Visitor;
import Behavioral.Visitor.Example.Visitors.XMLExportVisitor;

//Adding new Type of Shape (Dot,sphere) is bad
// bc we need to add new code to ALL visitors

public class Ex {

  public static void main(String[] args) {
    Shape circle = new Circle("1", 23);
    Shape circle2 = new Circle("2", 2);
    Shape rectangle = new Rectangle("1", 20, 30);
    Shape rectangle2 = new Rectangle("2", 2, 3000);

    Visitor paint = new PaintDraw();
    Visitor xml = new XMLExportVisitor();

    circle.accept(paint);
    circle2.accept(paint);
    rectangle2.accept(paint);

    circle.accept(xml);
    rectangle2.accept(xml);
  }
}
