package Behavioral.Observer.Example.withJDK.Observers;

import java.util.Observable;
import java.util.Observer;

public class Investor implements Observer {

  @Override
  public void update(Observable o, Object arg) {
    System.out.println("We cong. community with so big membership");
  }
}
