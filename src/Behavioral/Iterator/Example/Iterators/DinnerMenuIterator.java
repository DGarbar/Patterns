package Behavioral.Iterator.Example.Iterators;

import Behavioral.Iterator.Example.Menus.MenuItem.MenuItem;
import java.util.Iterator;

/*
 *  We can just convert to List
 *  List<MenuItem> list = Arrays.asList(dinnerMenu)
 *  and get Iterator
 *  list.iterator()
 */


public class DinnerMenuIterator implements Iterator<MenuItem> {

  private MenuItem[] dinnerMenu;
  private int position = 0;

  public DinnerMenuIterator(MenuItem[] dinnerMenu) {
    this.dinnerMenu = dinnerMenu;
  }

  @Override
  public boolean hasNext() {
    return position < dinnerMenu.length && dinnerMenu[position] != null;
  }

  @Override
  public MenuItem next() {
    return dinnerMenu[position++];
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException("Not supported for Dinner Menu");
  }
}
