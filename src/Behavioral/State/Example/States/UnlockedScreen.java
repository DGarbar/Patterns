package Behavioral.State.Example.States;

import Behavioral.State.Example.Phone.Phone;

public class UnlockedScreen implements ScreenState {

  //Double bond for changing the connection
  private Phone phone;

  public UnlockedScreen(Phone phone) {
    this.phone = phone;
  }

  //Change state of phone
  @Override
  public void clickLockButton() {
    phone.setCurrentState(phone.getScreenOffState());
  }

  @Override
  public void touchScreen() {
    System.out.println("You touch screen... And what do you wanted to see?");
  }
}
