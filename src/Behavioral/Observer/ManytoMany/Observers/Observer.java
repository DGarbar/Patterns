package Behavioral.Observer.ManytoMany.Observers;

import Behavioral.Observer.ManytoMany.Subject.ObservablePublisher;

public interface Observer {

  //we have more than one Publisher and we want to separate update method in channels
  void update(ObservablePublisher observablePublisher, String news);

  //if we don't have this task
  //void update(String news);
}
