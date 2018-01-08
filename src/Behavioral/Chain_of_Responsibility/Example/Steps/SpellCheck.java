package Behavioral.Chain_of_Responsibility.Example.Steps;

public class SpellCheck extends Step {

  @Override
  public boolean check(String name, int pas) {
    System.out.println("SpellCheck...");
    if (name.isEmpty()) {
      System.out.println("You mast wrote something");
    } else if (name.matches("\\w*")) {
      return checkNext(name, pas);
    } else {
      System.out.println("Invalid name");
    }
    return false;
  }
}
