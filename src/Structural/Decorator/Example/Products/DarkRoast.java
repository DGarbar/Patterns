package Structural.Decorator.Example.Products;

public class DarkRoast implements Beverage {

  @Override
  public String getDescription() {
    return "DarkRoast";
  }

  @Override
  public double cost() {
    return 2.2;
  }
}
