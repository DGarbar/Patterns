package Structural.Composite.Example.With_Iterator.Restoran.Menu;

import Structural.Composite.Example.With_Iterator.Iterators.CompositeIterator;
import Structural.Composite.Example.With_Iterator.Restoran.MenuComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Menu implements only his method
public class Menu extends MenuComponent {

  private Iterator<MenuComponent> iterator;
  private List<MenuComponent> menu;
  private String name;

  public Menu(String name) {
    this.name = name;
    menu = new ArrayList<>();
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void add(MenuComponent menuComponent) {
    menu.add(menuComponent);
  }

  @Override
  public void remove(MenuComponent menuComponent) {
    menu.remove(menuComponent);
  }

  @Override
  public Iterator<MenuComponent> createIterator() {
    if (iterator == null) {
      iterator = new CompositeIterator(menu.iterator());
    }
    return iterator;
  }

  @Override
  public void print() {
    System.out.println("/////////////////");
    System.out.println("Menu : " + getName() + " have : ");
    for (MenuComponent menuComponent : menu) {
      menuComponent.print();
    }
  }

}
