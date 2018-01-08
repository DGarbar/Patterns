package Behavioral.Chain_of_Responsibility.Example.Db;

import java.util.HashMap;
import java.util.Map;

public class DB {

  public static Map<String, Integer> users;

  static {
    users = new HashMap<>();
    users.put("Dima", 1);
    users.put("User", 1234);
    users.put("Admin", 0);
    users.put("Cat", 9990);
  }

}
