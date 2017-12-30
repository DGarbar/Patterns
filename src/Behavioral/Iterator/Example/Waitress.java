package Behavioral.Iterator.Example;

import Behavioral.Iterator.Example.Menus.DinnerMenu;
import Behavioral.Iterator.Example.Menus.MenuItem.MenuItem;
import Behavioral.Iterator.Example.Menus.PancakeMenu;
import java.util.Iterator;

public class Waitress {

  private PancakeMenu pancakeMenu;
  private DinnerMenu dinnerMenu;

  public Waitress(PancakeMenu pancakeMenu, DinnerMenu dinnerMenu) {
    this.pancakeMenu = pancakeMenu;
    this.dinnerMenu = dinnerMenu;
  }

  public void printMenu() {
    Iterator<MenuItem> pancakeMenuIterator = pancakeMenu.iterator();
    Iterator<MenuItem> dinerMenuIterator = dinnerMenu.iterator();
    System.out.println("Pancake Menu is : ");
    printMenu(pancakeMenuIterator);
    System.out.println("Diner Menu is : ");
    printMenu(dinerMenuIterator);
  }


  private void printMenu(Iterator<MenuItem> iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = iterator.next();
      System.out.println(menuItem.getName() + "  Which price is only = " + menuItem.getPrice());
    }
  }
}
