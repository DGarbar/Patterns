package Creational.Factorys.Abstract_Factory.Products.Pizzas;

public abstract class Pizza {

  protected String name;

  // Some common operation for all products

  public void prepare() {
    System.out.println(name + " is Preparing");
  }

  public void bake() {
    System.out.println("Bake for 25 min");
  }

  public void cut() {
    System.out.println("Cutting the " + name);
  }

  public String getName() {
    return name;
  }
}
