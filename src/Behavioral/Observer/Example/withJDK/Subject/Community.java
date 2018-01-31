package Behavioral.Observer.Example.withJDK.Subject;

import java.util.Observable;
import java.util.Random;

public class Community extends Observable {

  private int members;

  public Community() {
    this.members = 0;
  }

  public int getMembers() {
    return members;
  }

  private void addMembers(int members) {
    this.members += members;
    if (hasChanged()) {
      notifyObservers("our Community have came " + members);
    }
  }

  public void agitation() throws InterruptedException {
    //Index when we notify our investors
    int i = 10;
    while (true) {

      //Add members 1 to 10

      addMembers(new Random().nextInt(10));
      Thread.sleep(500);
      System.out.println(members);

      //When members more than 10 we notify our investors
      if (members / i > 0) {
        setChanged();
        i *= 10;
      }
    }
  }
}
