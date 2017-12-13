package Behavioral.Observer.withJDK;

import Behavioral.Observer.withJDK.Observers.Investor;
import Behavioral.Observer.withJDK.Subject.Community;

public class Ex3 {

  public static void main(String[] args) throws InterruptedException {
    Community community = new Community();
    Investor investor1 = new Investor();
    Investor investor2 = new Investor();

    community.addObserver(investor1);
    community.addObserver(investor2);

    community.agitation();
  }

}
