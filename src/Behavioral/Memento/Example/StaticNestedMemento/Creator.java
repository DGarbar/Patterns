package Behavioral.Memento.Example.StaticNestedMemento;

public class Creator {

  private String name;

  private int lvl;
  private String type;
  private String state;

  public Creator(String name, String type, String state) {
    this.name = name;
    lvl = 0;
    this.type = type;
    this.state = state;
  }

  public void upLvl() {
    lvl++;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Memento save() {
    System.out.println("Saving...");
    return new Memento(lvl, type, state);
  }

  public void load(Memento memento) {
    lvl = memento.getLvl();
    type = memento.getType();
    state = memento.getState();
  }

  @Override
  public String toString() {
    return "Creator{" +
      "name='" + name + '\'' +
      ", lvl=" + lvl +
      ", type='" + type + '\'' +
      ", state='" + state + '\'' +
      '}';
  }

  //Nested static class
  public static class Memento {

    private final int lvl;
    private final String type;
    private final String state;

    public Memento(int lvl, String type, String state) {
      this.lvl = lvl;
      this.type = type;
      this.state = state;
    }

    //Accessible only by outer class

    private int getLvl() {
      return lvl;
    }

    private String getType() {
      return type;
    }

    private String getState() {
      return state;
    }
  }
}
