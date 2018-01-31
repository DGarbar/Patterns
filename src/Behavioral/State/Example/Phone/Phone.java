package Behavioral.State.Example.Phone;

import Behavioral.State.Example.States.LockScreen;
import Behavioral.State.Example.States.ScreenState;
import Behavioral.State.Example.States.UnlockedScreen;

public class Phone {

  //Context have different states

  //Double bond for changing the connection
  private ScreenState screenOffState;
  private ScreenState screenOnState;

  private ScreenState currentState;
  private int PIN;

  public Phone(int PIN) {
    this.PIN = PIN;
    screenOffState = new LockScreen(this);
    screenOnState = new UnlockedScreen(this);
    currentState = screenOffState;
  }

  //Some dependable on State method
  public void clickLockButton() {
    currentState.clickLockButton();
  }

  public void touchScreen() {
    currentState.touchScreen();
  }

  //Another method

  public void dropPhone() {
    System.out.println("Screen is a bit scratch, Y vas lapki");
  }

  public ScreenState getScreenOffState() {
    return screenOffState;
  }

  public ScreenState getScreenOnState() {
    return screenOnState;
  }

  public void setCurrentState(ScreenState currentState) {
    this.currentState = currentState;
  }

  public int getPIN() {
    return PIN;
  }
}
