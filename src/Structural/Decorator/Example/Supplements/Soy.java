package Structural.Decorator.Example.Supplements;

import Structural.Decorator.Example.Products.Beverage;

/*
 *Concrete class decorator
 */

public class Soy extends SupplementsDecorator {

  public Soy(Beverage beverage) {
    super(beverage);
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", soy";
  }

  @Override
  public double cost() {
    return beverage.cost() + 0.25;
  }
}
