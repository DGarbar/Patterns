package Creational.Builder.Example.StaticNested;

public class Ex {

  public static void main(String[] args) {
    FinalHouse house = new FinalHouse.Builder("Happy Family")
      .setCost(300)
      .setDoors(4)
      .setGarage(true)
      .setWindows(20)
      .build();

    //We also can use default parameters which in Builder
    FinalHouse house1 = new FinalHouse.Builder("Default Family").build();

  }

}
