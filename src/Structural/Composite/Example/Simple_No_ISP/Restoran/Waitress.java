package Structural.Composite.Example.Simple_No_ISP.Restoran;

public class Waitress {

  private MenuComponent mainMenu;

  public Waitress(MenuComponent mainMenu) {
    this.mainMenu = mainMenu;
  }

  //get all of the menu, bc we call top of the tree
  public void getMenu() {
    mainMenu.print();
  }
}
