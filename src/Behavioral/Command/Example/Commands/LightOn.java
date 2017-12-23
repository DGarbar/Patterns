package Behavioral.Command.Example.Commands;

import Behavioral.Command.Example.Receivers.Light;

public class LightOn implements Command {

  private Light light;

  public LightOn(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.switchON();
  }

  @Override
  public void undo() {
    light.switchOFF();
  }

}
