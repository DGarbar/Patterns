package Structural.Decorator.Example.Supplements;

import Structural.Decorator.Example.Products.Beverage;

public class Milk extends SupplementsDecorator {

  public Milk(Beverage beverage) {
    super(beverage);
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", milk";
  }

  @Override
  public double cost() {
    return beverage.cost() + 0.10;
  }
}
