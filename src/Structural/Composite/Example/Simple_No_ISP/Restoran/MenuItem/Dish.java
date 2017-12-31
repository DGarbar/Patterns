package Structural.Composite.Example.Simple_No_ISP.Restoran.MenuItem;

import Structural.Composite.Example.Simple_No_ISP.Restoran.MenuComponent;

public class Dish extends MenuComponent {

  private String name;
  private double price;

  public Dish(String name, double price) {
    this.name = name;
    this.price = price;
  }

  @Override
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public void print() {
    System.out.println(" - Name is: " + getName() + " which will be cost = " + getPrice());
  }
}
