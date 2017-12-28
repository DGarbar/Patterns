package Behavioral.Template_Method.Example.Beverage;

import java.util.Scanner;

public class Tea extends Beverage {

  private Scanner sc = new Scanner(System.in);

  @Override
  protected void brew() {
    System.out.println("Steeping the tra");
  }

  @Override
  protected boolean isWantHug() {
    System.out.println("You want hugs");
    System.out.println("y|n");

    return sc.nextLine().equals("y");
  }
}
