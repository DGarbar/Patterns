package Structural.Composite.Example.Simple_No_ISP;

/*
 * This example is violates the Interface Segregation principle,
 * but for transparency of the code.
 * (Client always work with MenuComponent,
 * so he can not ot worry about the instanceOf() )
 * But he also need catch the exception.
 */

import Structural.Composite.Example.Simple_No_ISP.Restoran.Menu.Menu;
import Structural.Composite.Example.Simple_No_ISP.Restoran.MenuComponent;
import Structural.Composite.Example.Simple_No_ISP.Restoran.MenuItem.Dish;
import Structural.Composite.Example.Simple_No_ISP.Restoran.Waitress;

// Some menus may have a different menu in the himself.
// Security is low bc he can use add(MenuComponent) in Dish, which not good.
public class Ex {

  public static void main(String[] args) {

    //Create Menus
    MenuComponent desertMenu1 = new Menu("Desert in haven menu");
    MenuComponent desertMenu2 = new Menu("Special propose menu");
    MenuComponent desertMenu3 = new Menu("Christmas menu");

    MenuComponent dinnerMenu = new Menu("Dinner for Gentlemen");

    //Adding item for mainMenu
    MenuComponent mainMenu = new Menu("Main menu : ");
    mainMenu.add(desertMenu1);
    mainMenu.add(dinnerMenu);
    Waitress waitress = new Waitress(mainMenu);

    //Adding item for another elements
    desertMenu1.add(new Dish("Waffles", 0.99));
    desertMenu1.add(new Dish("Desert", 2.90));
    desertMenu1.add(desertMenu2);

    desertMenu2.add(new Dish("Pancake with milk", 5.25));
    desertMenu2.add(desertMenu3);

    desertMenu3.add(new Dish("Santa sperm", 0.01));

    dinnerMenu.add(new Dish("HotDog", 3.99));
    dinnerMenu.add(new Dish("BLT", 10.99));
    dinnerMenu.add(new Dish("Soup", 7.99));

    waitress.getMenu();
  }
}