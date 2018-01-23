package Behavioral.Null_Object.Example.Animals;

public class NullAnimal implements Animal {

  private static NullAnimal ourInstance = new NullAnimal();

  public static NullAnimal getInstance() {
    return ourInstance;
  }

  private NullAnimal() {
  }

  @Override
  public void voice() {

  }

  @Override
  public void run() {

  }
}
