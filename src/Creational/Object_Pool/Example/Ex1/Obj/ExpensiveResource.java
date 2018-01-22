package Creational.Object_Pool.Example.Ex1.Obj;

public class ExpensiveResource {

  private String name;

  public ExpensiveResource(String name) {
    this.name = name;
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public void doSomething() {
    System.out.println("I am resource " + this.name + ".");
  }
}
