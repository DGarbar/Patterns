package Structural.Composite.Example.With_Iterator.Restoran;

/*
 * This example is violates the Interface Segregation principle,
 * but for transparency of the code.
 * (Client always work with MenuComponent,
 * so he can not ot worry about the instanceOf() )
 * But he also need catch the exception.
 */

import java.util.Iterator;

public abstract class MenuComponent {

  //Need in Menu and in MenuItem (dish)
  public abstract String getName();

  //Need in Menu and in MenuItem (dish)
  public abstract void print();

  //Need only in MenuItem (dish)
  public double getPrice() {
    throw new UnsupportedOperationException();
  }

  //Need only in Menu (for work with his elements)
  public void add(MenuComponent menuComponent) {
    throw new UnsupportedOperationException();
  }

  //Need only in Menu (for work with his elements)
  public void remove(MenuComponent menuComponent) {
    throw new UnsupportedOperationException();
  }

  //Need in Menu and in MenuItem (dish)
  public abstract Iterator<MenuComponent> createIterator();
}
