package Behavioral.Mediator.Example.Ex2;

import Behavioral.Mediator.Example.Ex2.Components.HouseStaff.AlarmClock;
import Behavioral.Mediator.Example.Ex2.Components.HouseStaff.BedroomDoor;
import Behavioral.Mediator.Example.Ex2.Components.HouseStaff.BedroomLight;
import Behavioral.Mediator.Example.Ex2.Components.HouseStaff.CoffeeMachine;
import Behavioral.Mediator.Example.Ex2.Components.HouseStaff.KitchenDoor;
import Behavioral.Mediator.Example.Ex2.Components.HouseStaff.KitchenLight;
import Behavioral.Mediator.Example.Ex2.Components.Sensors.KitchenSensor;
import Behavioral.Mediator.Example.Ex2.Components.Sensors.LeaveSensor;
import Behavioral.Mediator.Example.Ex2.Components.Sensors.WakeUpSensor;
import Behavioral.Mediator.Example.Ex2.Mediator.SmartHouse;
import Behavioral.Mediator.Example.Ex2.Mediator.SmartHouseBuilder;

public class Ex {

  public static void main(String[] args) {
    SmartHouse smartHouse = new SmartHouseBuilder()
      .setAlarmClock(new AlarmClock())
      .setBedroomDoor(new BedroomDoor())
      .setBedroomLight(new BedroomLight())
      .setCoffeeMachine(new CoffeeMachine())
      .setKitchenDoor(new KitchenDoor())
      .setKitchenLight(new KitchenLight())
      .createSmartHouse();

    //Each sensor don't know about HouseStaff, but know about mediator
    WakeUpSensor wakeUpSensor = new WakeUpSensor(smartHouse);
    KitchenSensor kitchenSensor = new KitchenSensor(smartHouse);
    LeaveSensor leaveSensor = new LeaveSensor(smartHouse);

    wakeUpSensor.sens();
    System.out.println("then go to Kitchen");
    kitchenSensor.sens();
    System.out.println("mMMm I hate coffee");
    System.out.println("Ohh i am late ****");
    leaveSensor.sens();
  }
}