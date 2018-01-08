package Behavioral.Chain_of_Responsibility.Example.Steps;

import Behavioral.Chain_of_Responsibility.Example.Db.DB;
import java.util.Scanner;

public class Registration extends Step {

  private Scanner sc = new Scanner(System.in);

  /*
      Check is user is in DB if hasn't
      add to DB new User
      and then go to Authentication Step (next Step)
  */

  //Also can be previous step but y menya lapki (for return to authorization)
  @Override
  public boolean check(String name, int pas) {
    System.out.println("Registration...");
    while (true) {
      if (DB.users.containsKey(name)) {
        System.out.println("Name already used");
        System.out.println("You want to exit? Y/N");
        if (sc.next().equalsIgnoreCase("y")) {
          return false;
        }
      } else {
        System.out.println("Write down Pas: ");
        pas = sc.nextInt();

        //add new User

        DB.users.put(name, pas);
        return checkNext(name, pas);
      }

      System.out.println("Write down Name: ");
      name = sc.next();
    }

  }
}
