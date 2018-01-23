package Behavioral.Null_Object.Example.Animals;

public class Cat implements Animal {

  @Override
  public void voice() {
    System.out.println("Mya Mya ");
  }

  @Override
  public void run() {
    System.out.println("Cat is running");
  }
}
