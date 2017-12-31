package Behavioral.Iterator.Example.Menus;

import Behavioral.Iterator.Example.Iterators.DinnerMenuIterator;
import Behavioral.Iterator.Example.Menus.MenuItem.MenuItem;
import java.util.Iterator;

//interface Menu extends Iterable
public class DinnerMenu implements Menu {

  private final int MENU_SIZE = 10;
  private int lastItemIndex = 0;
  private MenuItem[] dinnerMenu;

  //Lazy init.
  public DinnerMenu() {
    dinnerMenu = new MenuItem[MENU_SIZE];

    //some items

    addItem(new MenuItem("HotDog", 3.99));
    addItem(new MenuItem("BLT", 10.99));
    addItem(new MenuItem("Soup", 7.99));
  }

  public void addItem(MenuItem menuItem) {
    if (lastItemIndex < MENU_SIZE) {
      dinnerMenu[lastItemIndex++] = menuItem;
    } else {
      System.out.println("Menu is full");
    }
  }

  @Override
  public Iterator<MenuItem> iterator() {
    return new DinnerMenuIterator(dinnerMenu);
  }
}
