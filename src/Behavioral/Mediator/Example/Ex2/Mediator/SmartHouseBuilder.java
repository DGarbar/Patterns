package Behavioral.Mediator.Example.Ex2.Mediator;

import Behavioral.Mediator.Example.Ex2.Components.HouseStaff.AlarmClock;
import Behavioral.Mediator.Example.Ex2.Components.HouseStaff.BedroomDoor;
import Behavioral.Mediator.Example.Ex2.Components.HouseStaff.BedroomLight;
import Behavioral.Mediator.Example.Ex2.Components.HouseStaff.CoffeeMachine;
import Behavioral.Mediator.Example.Ex2.Components.HouseStaff.KitchenDoor;
import Behavioral.Mediator.Example.Ex2.Components.HouseStaff.KitchenLight;

public class SmartHouseBuilder {

  private AlarmClock alarmClock;
  private BedroomDoor bedroomDoor;
  private BedroomLight bedroomLight;
  private CoffeeMachine coffeeMachine;
  private KitchenDoor kitchenDoor;
  private KitchenLight kitchenLight;

  public SmartHouseBuilder setAlarmClock(AlarmClock alarmClock) {
    this.alarmClock = alarmClock;
    return this;
  }

  public SmartHouseBuilder setBedroomDoor(BedroomDoor bedroomDoor) {
    this.bedroomDoor = bedroomDoor;
    return this;
  }

  public SmartHouseBuilder setBedroomLight(BedroomLight bedroomLight) {
    this.bedroomLight = bedroomLight;
    return this;
  }

  public SmartHouseBuilder setCoffeeMachine(CoffeeMachine coffeeMachine) {
    this.coffeeMachine = coffeeMachine;
    return this;
  }

  public SmartHouseBuilder setKitchenDoor(KitchenDoor kitchenDoor) {
    this.kitchenDoor = kitchenDoor;
    return this;
  }

  public SmartHouseBuilder setKitchenLight(KitchenLight kitchenLight) {
    this.kitchenLight = kitchenLight;
    return this;
  }

  public SmartHouse createSmartHouse() {
    return new SmartHouse(alarmClock, bedroomDoor, bedroomLight, coffeeMachine, kitchenDoor,
      kitchenLight);
  }
}