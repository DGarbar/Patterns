package Behavioral.Template_Method.Example;

import Behavioral.Template_Method.Example.Beverage.Coffee;
import Behavioral.Template_Method.Example.Beverage.Tea;

public class Ex1 {

  public static void main(String[] args) {
    Coffee coffee = new Coffee();
    Tea tea = new Tea();

    coffee.prepare();
    System.out.println("/////");
    tea.prepare();
  }

}
