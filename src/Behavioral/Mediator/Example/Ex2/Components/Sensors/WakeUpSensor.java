package Behavioral.Mediator.Example.Ex2.Components.Sensors;

import Behavioral.Mediator.Example.Ex2.Mediator.Mediator;

public class WakeUpSensor extends Sensor {

  public WakeUpSensor(Mediator mediator) {
    super(mediator);
  }

  @Override
  public void sens() {
    mediator.notify("WakeUp");
  }
}
