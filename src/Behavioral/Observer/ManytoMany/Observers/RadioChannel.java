package Behavioral.Observer.ManytoMany.Observers;

import Behavioral.Observer.ManytoMany.Subject.ObservablePublisher;
import Behavioral.Observer.ManytoMany.Subject.RUNewsPublisher;
import Behavioral.Observer.ManytoMany.Subject.UANewsPublisher;

public class RadioChannel implements Observer {

  @Override
  public void update(ObservablePublisher observablePublisher, String news) {
    if (observablePublisher instanceof RUNewsPublisher) {
      System.out.println("Radio says that - " + news + "says Russia");
    } else if (observablePublisher instanceof UANewsPublisher) {
      System.out.println("Radio says that - " + news + "says Ukraine");
    } else {
      System.out.println(observablePublisher);
    }
  }

}
