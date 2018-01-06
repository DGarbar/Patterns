package Structural.Bridge.Example.RemoteControllers;

import Structural.Bridge.Example.Devices.Device;

public class TouchScreen extends RemoteController {

  public TouchScreen(Device device) {
    super(device);
  }

  @Override
  public void changeChanel() {
    System.out.println("Swipe left");
    device.nextChannel();
  }

  public void mute() {
    device.setVolume(0);
  }
}
