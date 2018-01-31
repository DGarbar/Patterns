package Behavioral.Chain_of_Responsibility.Example.Steps;

import Behavioral.Chain_of_Responsibility.Example.Db.DB;
import java.util.Scanner;

public class Authorization extends Step {

  private Step regStep;
  private Scanner sc = new Scanner(System.in);

  public Authorization(Step regStep) {
    this.regStep = regStep;
  }

  /*
   * Second step.
   * Verify that the user is in the DB.
   * If not, propose to create new user (go to Registration step)
   * else go to Authentication step
   */

  @Override
  public boolean check(String name, int pas) {
    System.out.println("Authorization...");
    if (DB.users.containsKey(name)) {
      return checkNext(name, pas);
    } else {
      if (isReg()) {
        regStep.check(name, pas);
      }
    }
    return false;
  }

  private boolean isReg() {
    System.out.println("Your name is incorrect");
    System.out.println("Do you want to register? Y/N");
    return sc.next().equalsIgnoreCase("y");
  }

}
