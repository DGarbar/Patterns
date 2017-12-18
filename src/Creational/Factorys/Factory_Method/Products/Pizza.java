package Creational.Factorys.Factory_Method.Products;

public abstract class Pizza {

  String name;

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
