package Behavioral.Template_Method.Example.Beverage;

public abstract class Beverage {

  final public void prepare() {
    boilWater();
    brew();
    if (isWantHug()) {

      //Some optional(can ignore) steps

      System.out.println("Cheek to cheek");
    }
  }

  abstract protected void brew();

  //our hook
  protected boolean isWantHug() {

    //Some default code

    return false;
  }


  //Structure of algorithm
  //Common steps in ALL algorithms
  private void boilWater() {
    System.out.println("Boiling water");
  }

  private void pourInCup() {
    System.out.println("Pouring in a cup");
  }
}
