package Behavioral.Observer.Example.ManytoMany.Observers;

import Behavioral.Observer.Example.ManytoMany.Subject.ObservablePublisher;

// Better use Mediator
public interface Observer {

  //We have more than one Publisher and we want to separate update method in channels
  void update(ObservablePublisher observablePublisher, String news);

  //if we don't have this task
  //void update(String news);
}
