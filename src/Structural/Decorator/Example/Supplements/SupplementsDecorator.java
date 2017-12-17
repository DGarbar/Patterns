package Structural.Decorator.Example.Supplements;

import Structural.Decorator.Example.Products.Beverage;

/*
 * Common class for all Decorators(Supplements)
 * Sometimes can be ignored(not exists)
 */

public abstract class SupplementsDecorator implements Beverage {

  Beverage beverage;

  public SupplementsDecorator(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public abstract String getDescription();

  @Override
  public abstract double cost();
}
