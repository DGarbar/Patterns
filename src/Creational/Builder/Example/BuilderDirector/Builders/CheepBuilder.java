package Creational.Builder.Example.BuilderDirector.Builders;

import Creational.Builder.Example.BuilderDirector.Object.House;

public class CheepBuilder implements Builder {

  private int price;
  private int wall;
  private int door;
  private int window;
  private String roof;
  private String foundation;

  @Override
  public void setWall(int wall) {
    this.wall = wall;
    price += 200 * wall;
  }

  @Override
  public void setWindow(int window) {
    this.window = window;
    price += 100 * window;
  }

  @Override
  public void setRoof() {
    roof = "Cheap";
    price += 400;
  }

  @Override
  public void setFoundation() {
    foundation = "Cheap";
    price += 400;
  }

  @Override
  public void setDoor(int door) {
    this.door = door;
    price += 50 * door;
  }

  @Override
  public House getHouse() {
    House house = new House(wall, door, window, price, foundation, roof);
    price = 0;
    return house;
  }
}
