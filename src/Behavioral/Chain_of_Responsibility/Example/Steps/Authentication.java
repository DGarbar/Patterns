package Behavioral.Chain_of_Responsibility.Example.Steps;

import Behavioral.Chain_of_Responsibility.Example.Db.DB;

public class Authentication extends Step {

  /*
   * Last step.
   * Verify password with name from DB.
   */

  @Override
  public boolean check(String name, int pas) {
    System.out.println("Authentication....");
    if (DB.users.get(name) == pas) {
      System.out.println("You are in");
      System.out.println("Welcome");
      return true;
    } else {
      System.out.println("Passs is wrong");
      return false;
    }
  }
}
