package Creational.Builder.Example.BuilderDirector.Directors;

import Creational.Builder.Example.BuilderDirector.Builders.Builder;
import Creational.Builder.Example.BuilderDirector.Object.House;

// Can be abstract (Bridge realisation)
public class Director {

  private Builder builder;

  public Director(Builder builder) {
    this.builder = builder;
  }

  public void changeBuilder(Builder builder) {
    this.builder = builder;
  }

  public House getBigHousePrice() {
    builder.setFoundation();
    builder.setDoor(11);
    builder.setWall(20);
    builder.setWindow(15);
    builder.setRoof();

    return builder.getHouse();
  }

  //Can be in another director
  public House getSmallHousePrice() {
    builder.setFoundation();
    builder.setDoor(6);
    builder.setWall(10);
    builder.setWindow(5);
    builder.setRoof();

    return builder.getHouse();
  }
}
