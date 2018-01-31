package Structural.Composite.Example.With_Iterator.Restoran.MenuItem;

import Structural.Composite.Example.With_Iterator.Iterators.NullIterator;
import Structural.Composite.Example.With_Iterator.Restoran.MenuComponent;
import java.util.Iterator;

//MenuItem (Dish) implements only his method
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

  @Override
  public Iterator<MenuComponent> createIterator() {
    return new NullIterator();
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public void print() {
    System.out.println(" - Name is: " + getName() + " which will be cost = " + getPrice());
  }
}
