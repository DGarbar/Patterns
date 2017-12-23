package Behavioral.Command.Example.Receivers;

public class Light {

  private boolean on;
  private String name;

  public Light(String name) {
    this.name = name;
  }

  public void switchON() {
    on = true;
    System.out.println("Light in " + name + " is On");
  }

  public void switchOFF() {
    on = false;
    System.out.println("Light in " + name + " is Off");
  }


}
