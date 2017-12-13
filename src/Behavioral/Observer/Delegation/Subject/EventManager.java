package Behavioral.Observer.Delegation.Subject;

import Behavioral.Observer.Delegation.Observers.Observer;
import java.util.ArrayList;
import java.util.List;

public class EventManager implements Observable {

  private List<Observer> users = new ArrayList<>();

  @Override
  public void registerObserver(Observer user) {
    users.add(user);
  }

  @Override
  public void removeObserver(Observer user) {
    users.remove(user);
  }

  @Override
  public void notifyObserver(String data) {
    users.forEach(x -> x.update(data));
  }
}
