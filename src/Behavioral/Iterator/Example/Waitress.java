package Behavioral.Iterator.Example;

import Behavioral.Iterator.Example.Menus.Menu;
import Behavioral.Iterator.Example.Menus.MenuItem.MenuItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Waitress {

  private List<Menu> menus;

  public Waitress() {
    menus = new ArrayList<>();
  }

  public void printMenu() {
    for (Menu menu : menus) {
      printMenu(menu.iterator());
    }
  }


  public void addMenu(Menu menu) {
    menus.add(menu);
  }

  private void printMenu(Iterator<MenuItem> iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = iterator.next();
      System.out.println(menuItem.getName() + "  Which price is only = " + menuItem.getPrice());
    }
    System.out.println("//////");
  }
}
