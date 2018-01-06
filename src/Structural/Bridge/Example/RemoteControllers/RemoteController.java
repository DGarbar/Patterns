package Structural.Bridge.Example.RemoteControllers;

import Structural.Bridge.Example.Devices.Device;

public abstract class RemoteController {

  protected Device device;

  public RemoteController(Device device) {
    this.device = device;
  }

  public void power() {
    if (device.isEnable()) {
      device.disable();
    } else {
      device.enable();
    }
  }

  public void volumeUp() {
    device.setVolume(device.getVolume() + 10);
  }

  public void volumeDown() {
    device.setVolume(device.getVolume() - 10);
  }

  public abstract void changeChanel();


}
