package Behavioral.State.Example;

import Behavioral.State.Example.Phone.Phone;

public class Ex {

  public static void main(String[] args) throws InterruptedException {
    Phone phone = new Phone(1111);

    phone.touchScreen();
    Thread.sleep(1000);

    phone.touchScreen();
    phone.clickLockButton();
    phone.touchScreen();
  }
}
