package Behavioral.State.Example.Phone;

public class Phone {

  //Context have different states

  //Bad example Need change
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

  ScreenState getScreenOffState() {
    return screenOffState;
  }

  ScreenState getScreenOnState() {
    return screenOnState;
  }

  void setCurrentState(ScreenState currentState) {
    this.currentState = currentState;
  }

  int getPIN() {
    return PIN;
  }
}
