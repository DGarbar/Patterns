package Behavioral.Observer.Example.ManytoMany.Subject;

import Behavioral.Observer.Example.ManytoMany.Observers.Observer;
import java.util.ArrayList;
import java.util.List;

// We can create abstract class if we have more than 1 Publisher

public abstract class ObservablePublisher implements Observable {

  protected List<Observer> channels = new ArrayList<>();
  protected String news;

  @Override
  public void registerObserver(Observer observer) {
    channels.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    channels.remove(observer);
  }

// If we don't need to separate our Publisher / or we have only one Publisher
//
//  @Override
//  public void notifyObserver() {
//    channels.forEach(ch -> ch.update(news));
//  }

  public void setNews(String news) {
    this.news = news;
    analyzingNews();
  }

  protected abstract void analyzingNews();

}
