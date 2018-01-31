package Structural.Facade.Example.Facade;

import Structural.Facade.Example.Subsystem.Mather;
import Structural.Facade.Example.Subsystem.Proz;
import Structural.Facade.Example.Subsystem.Video_Card;

/*
 * We can create additional Facade = Computer_Peripherals
 * (in case if we want to add Mouse, Keyboard, Monitor
 * If the responsibility of the facade begins to blur.
 */

public class Computer {

  private Video_Card video_card;
  private Proz proz;
  private Mather mather;

  public Computer(Video_Card video_card, Proz proz, Mather mather) {
    this.video_card = video_card;
    this.proz = proz;
    this.mather = mather;
  }

  public void computerOn() {
    mather.powerOn();
    proz.powerOn();
    video_card.powerOn();
    video_card.showPicture();

    //Mb some another method

  }

  public void computerOff() {
    mather.powerOff();
    proz.powerOff();
    video_card.powerOff();

    //Mb some another method

  }

}

