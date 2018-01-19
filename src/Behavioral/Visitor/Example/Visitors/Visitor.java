package Behavioral.Visitor.Example.Visitors;

import Behavioral.Visitor.Example.Shapes.Circle;
import Behavioral.Visitor.Example.Shapes.Rectangle;

//Adding new Visitors is norm
public interface Visitor {

  void visit(Rectangle rectangle);

  void visit(Circle circle);
}
