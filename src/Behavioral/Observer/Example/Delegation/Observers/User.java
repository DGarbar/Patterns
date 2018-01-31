package Behavioral.Observer.Example.Delegation.Observers;

public class User implements Observer {

  private int id;

  public User(int id) {
    this.id = id;
  }

  @Override
  public void update(String data) {
    System.out.println("User: " + id + " get " + data);
  }
}
