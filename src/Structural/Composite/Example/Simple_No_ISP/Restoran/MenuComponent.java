package Structural.Composite.Example.Simple_No_ISP.Restoran;

/*
 * This example is violates the Interface Segregation principle,
 * but for transparency of the code.
 * (Client always work with MenuComponent,
 * so he can not ot worry about the instanceOf() )
 * But he also need catch the exception.
 */

public abstract class MenuComponent {

  //Need in Menu and in MenuItem (dish)
  public String getName() {
    throw new UnsupportedOperationException();
  }

  //Need in Menu and in MenuItem (dish)
  public void print() {
    throw new UnsupportedOperationException();
  }

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
}
