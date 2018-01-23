package Behavioral.Null_Object.Example.Animals;

public class Dog implements Animal {

  @Override
  public void voice() {
    System.out.println("GAV GAV ");
  }

  @Override
  public void run() {
    System.out.println("Dog is running");
  }
}
