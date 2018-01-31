package Behavioral.Observer.Example.ManytoMany;

import Behavioral.Observer.Example.ManytoMany.Observers.RadioChannel;
import Behavioral.Observer.Example.ManytoMany.Observers.TVChannel;
import Behavioral.Observer.Example.ManytoMany.Subject.RUNewsPublisher;
import Behavioral.Observer.Example.ManytoMany.Subject.UANewsPublisher;

// Better use Mediator
public class Ex1 {

  public static void main(String[] args) {
    RUNewsPublisher ruNewsPublisher = new RUNewsPublisher();
    UANewsPublisher uaNewsPublisher = new UANewsPublisher();
    RadioChannel radioChannel1 = new RadioChannel();
    RadioChannel radioChannel2 = new RadioChannel();
    TVChannel tvChannel = new TVChannel();

    ruNewsPublisher.registerObserver(radioChannel1);
    ruNewsPublisher.registerObserver(tvChannel);
    uaNewsPublisher.registerObserver(radioChannel2);
    uaNewsPublisher.registerObserver(tvChannel);

    ruNewsPublisher.setNews("Java - best in the world");
    ruNewsPublisher.removeObserver(radioChannel1);
    ruNewsPublisher.setNews("Java is great");

    uaNewsPublisher.setNews("Java == love");
  }

}
