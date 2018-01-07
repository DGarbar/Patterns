package Creational.Builder.Example.BuilderDirector.Object;

public class House {

  private final int wall;
  private final int door;
  private final int window;
  private final int price;
  private final String foundation;
  private final String roof;

  public House(int wall, int door, int window, int price, String foundation, String roof) {
    this.wall = wall;
    this.door = door;
    this.window = window;
    this.price = price;
    this.foundation = foundation;
    this.roof = roof;
  }

  public int getWall() {
    return wall;
  }

  public int getDoor() {
    return door;
  }

  public int getWindow() {
    return window;
  }

  public int getPrice() {
    return price;
  }

  public String getFoundation() {
    return foundation;
  }

  public String getRoof() {
    return roof;
  }

  @Override
  public String toString() {
    return "House{" +
      "wall=" + wall +
      ", door=" + door +
      ", window=" + window +
      ", price=" + price +
      ", foundation='" + foundation + '\'' +
      ", roof='" + roof + '\'' +
      '}';
  }
}
