package Behavioral.Mediator.Example.Ex2.Mediator;

import Behavioral.Mediator.Example.Ex2.Components.HouseStaff.AlarmClock;
import Behavioral.Mediator.Example.Ex2.Components.HouseStaff.BedroomDoor;
import Behavioral.Mediator.Example.Ex2.Components.HouseStaff.BedroomLight;
import Behavioral.Mediator.Example.Ex2.Components.HouseStaff.CoffeeMachine;
import Behavioral.Mediator.Example.Ex2.Components.HouseStaff.KitchenDoor;
import Behavioral.Mediator.Example.Ex2.Components.HouseStaff.KitchenLight;

// We also can use Observer and interface to all HouseStaff

public class SmartHouse implements Mediator {

  private AlarmClock alarmClock;
  private BedroomDoor bedroomDoor;
  private BedroomLight bedroomLight;
  private CoffeeMachine coffeeMachine;
  private KitchenDoor kitchenDoor;
  private KitchenLight kitchenLight;

  public SmartHouse(AlarmClock alarmClock,
    BedroomDoor bedroomDoor,
    BedroomLight bedroomLight,
    CoffeeMachine coffeeMachine,
    KitchenDoor kitchenDoor,
    KitchenLight kitchenLight) {
    this.alarmClock = alarmClock;
    this.bedroomDoor = bedroomDoor;
    this.bedroomLight = bedroomLight;
    this.coffeeMachine = coffeeMachine;
    this.kitchenDoor = kitchenDoor;
    this.kitchenLight = kitchenLight;
  }

  @Override
  public void notify(String state) {
    switch (state) {
      case "WakeUp":
        alarmClock.turnOfAlarm();
        bedroomDoor.open();
        bedroomLight.on();
        coffeeMachine.boil();
        break;
      case "Kitchen":
        kitchenDoor.open();
        kitchenLight.on();
        bedroomLight.off();
        bedroomDoor.close();
        break;
      case "Leave":
        bedroomDoor.close();
        kitchenDoor.close();
        bedroomLight.off();
        kitchenLight.off();
        break;
    }
  }
}
