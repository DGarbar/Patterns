package Behavioral.Mediator.Example.Ex2.Components.Sensors;

import Behavioral.Mediator.Example.Ex2.Mediator.Mediator;

public class KitchenSensor extends Sensor {

  public KitchenSensor(Mediator mediator) {
    super(mediator);
  }

  @Override
  public void sens() {
    mediator.notify("Kitchen");
  }
}
