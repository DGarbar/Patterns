package Structural.Composite.Example.With_Iterator.Restoran;

import java.util.Iterator;

public class Waitress {

  private MenuComponent mainMenu;

  public Waitress(MenuComponent mainMenu) {
    this.mainMenu = mainMenu;
  }

  //get all of the menu, bc we call top of the tree
  public void getMenu() {
    mainMenu.print();
  }

  public void getMenuWithMinPrice(double price) {
    Iterator<MenuComponent> iterator = mainMenu.createIterator();
    System.out.println("All with price above " + price);
    while (iterator.hasNext()) {
      MenuComponent menuComponent = iterator.next();
      try {

        //Price is only in the Dish

        if (menuComponent.getPrice() >= price) {
          menuComponent.print();
        }
      } catch (UnsupportedOperationException ignored) {
      }
    }
  }
}
