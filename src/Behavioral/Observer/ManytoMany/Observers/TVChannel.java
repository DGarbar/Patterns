package Behavioral.Observer.ManytoMany.Observers;

import Behavioral.Observer.ManytoMany.Subject.ObservablePublisher;
import Behavioral.Observer.ManytoMany.Subject.RUNewsPublisher;
import Behavioral.Observer.ManytoMany.Subject.UANewsPublisher;

public class TVChannel implements Observer {

  @Override
  public void update(ObservablePublisher observablePublisher, String news) {
    if (observablePublisher instanceof RUNewsPublisher) {
      System.out.println("TV shows that - " + news + "says Russia");
    } else if (observablePublisher instanceof UANewsPublisher) {
      System.out.println("TV shows that - " + news + "says Ukraine");
    }
  }
}
