package Behavioral.Observer.ManytoMany.Subject;

public class RUNewsPublisher extends ObservablePublisher {

  @Override
  public void notifyObserver() {

    channels.forEach(ch -> ch.update(this, news));
  }

  protected void analyzingNews() {

    //do some work with News

    // notify our channels
    notifyObserver();
  }
}
