package Behavioral.Template_Method.Example.Beverage;

public class Coffee extends Beverage {

  @Override
  protected void brew() {
    System.out.println("Dripping Coffee through filter");
  }

}
