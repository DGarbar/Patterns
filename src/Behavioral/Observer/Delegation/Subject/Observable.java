package Behavioral.Observer.Delegation.Subject;

import Behavioral.Observer.Delegation.Observers.Observer;
//If we have one Publisher we need only Interface

public interface Observable {

  void registerObserver(Observer observer);

  void removeObserver(Observer observer);

  void notifyObserver(String data);
}
