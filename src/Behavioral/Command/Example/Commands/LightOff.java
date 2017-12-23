package Behavioral.Command.Example.Commands;

import Behavioral.Command.Example.Receivers.Light;

public class LightOff implements Command {

  private Light light;

  public LightOff(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.switchOFF();
  }

  @Override
  public void undo() {
    light.switchON();
  }
}
