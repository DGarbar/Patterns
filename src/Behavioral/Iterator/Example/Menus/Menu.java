package Behavioral.Iterator.Example.Menus;

import Behavioral.Iterator.Example.Menus.MenuItem.MenuItem;

public interface Menu extends Iterable<MenuItem> {

  void addItem(MenuItem menuItem);
}
