package Structural.Decorator.Example.Products;

public class Espresso implements Beverage {

  @Override
  public String getDescription() {
    return "Espresso";
  }

  @Override
  public double cost() {
    return 1.5;
  }
}
