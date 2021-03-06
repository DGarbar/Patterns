package Behavioral.Iterator.Example.Menus;

import Behavioral.Iterator.Example.Menus.MenuItem.MenuItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Interface Menu extends Iterable
public class PancakeMenu implements Menu {

  private List<MenuItem> pancakeMenu;

  public PancakeMenu() {
    pancakeMenu = new ArrayList<>();

    //some items
    addItem(new MenuItem("Waffles", 0.99));
    addItem(new MenuItem("Pancake with milk", 5.25));
    addItem(new MenuItem("Desert", 2.90));
  }

  public void addItem(MenuItem menuItem) {
    pancakeMenu.add(menuItem);
  }

  @Override
  public Iterator<MenuItem> iterator() {
    return pancakeMenu.iterator();

    //or we can use more functional listIterator();
    //return pancakeMenu.listIterator();
  }
}
