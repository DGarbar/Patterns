package Behavioral.Observer.Example.Delegation.Subject;

public class DataBase {

  private int id;
  private String name;
  public EventManager eventManager;

  public DataBase(int id, String name) {
    this.id = id;
    this.name = name;
    eventManager = new EventManager();
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  //notify user when DB is changed

  public void setId(int id) {
    this.id = id;
    eventManager.notifyObserver("Id have changed");
  }

  public void setName(String name) {
    this.name = name;
    eventManager.notifyObserver("Name have changed");
  }
}
