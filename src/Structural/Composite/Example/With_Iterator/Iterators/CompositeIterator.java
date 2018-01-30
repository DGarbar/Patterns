package Structural.Composite.Example.With_Iterator.Iterators;

import Structural.Composite.Example.With_Iterator.Restoran.Menu.Menu;
import Structural.Composite.Example.With_Iterator.Restoran.MenuComponent;
import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {

  private Stack<Iterator<MenuComponent>> stack = new Stack<>();

  public CompositeIterator(
    Iterator<MenuComponent> iterator) {
    stack.push(iterator);
  }

  @Override
  public MenuComponent next() {
    if (hasNext()) {
      Iterator<MenuComponent> iterator = stack.peek();
      MenuComponent component = iterator.next();
      if (component instanceof Menu) {
        //Need to go through the nested combination
        stack.push(component.createIterator());
      }
      return component;
    } else {
      return null;
    }
  }

  @Override
  public boolean hasNext() {
    if (stack.isEmpty()) {
      return false;
    } else {
      Iterator<MenuComponent> iterator = stack.peek();
      if (!iterator.hasNext()) {
        //If iterator is on last element (does not have next element)
        //delete iterator from stack and then use next Iterator.
        stack.pop();
        return hasNext();
      } else {
        return true;
      }
    }
  }
}
