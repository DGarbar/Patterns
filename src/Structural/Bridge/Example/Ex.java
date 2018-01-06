package Structural.Bridge.Example;

import Structural.Bridge.Example.Devices.Device;
import Structural.Bridge.Example.Devices.Radio;
import Structural.Bridge.Example.Devices.TV;
import Structural.Bridge.Example.RemoteControllers.NewConsole;
import Structural.Bridge.Example.RemoteControllers.PrimitiveConsole;
import Structural.Bridge.Example.RemoteControllers.TouchScreen;

public class Ex {

  public static void main(String[] args) {
    Device tv = new TV();
    Device radio = new Radio();

    TouchScreen touchScreen = new TouchScreen(tv);
    NewConsole newConsole = new NewConsole(tv);
    PrimitiveConsole primitiveConsole = new PrimitiveConsole(radio);

    touchScreen.power();
    touchScreen.changeChanel();
    touchScreen.changeChanel();
    newConsole.changeChanel();
    newConsole.mute();

    primitiveConsole.power();
    primitiveConsole.changeChanel();

    //we can do now with radio
    NewConsole newConsole1 = new NewConsole(radio);
    newConsole.mute();
  }
}
