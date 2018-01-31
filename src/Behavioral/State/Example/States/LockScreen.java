package Behavioral.State.Example.States;

import Behavioral.State.Example.Phone.Phone;
import java.util.Date;
import java.util.Scanner;

public class LockScreen implements ScreenState {

  //Double bond for changing the connection
  private Phone phone;
  private Scanner sc;

  public LockScreen(Phone phone) {
    this.phone = phone;
    sc = new Scanner(System.in);
  }

  @Override
  public void touchScreen() {
    System.out.println("You see current time: " + new Date().toString());
  }

  @Override
  public void clickLockButton() {
    System.out.println("Write PIN pls :");

    int attempt = 3;
    while (attempt > 0) {
      if (pinCheck(sc.nextInt())) {
        phone.setCurrentState(phone.getScreenOnState());
        System.out.println("Welcome");
        break;
      } else {
        System.out.println("You wrote incorrect PIN, pls try again");
        attempt--;
      }
    }
  }

  private boolean pinCheck(int pin) {
    return pin == phone.getPIN();
  }
}
