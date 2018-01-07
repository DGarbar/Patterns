package Creational.Builder.Example.StaticNested;

public class FinalHouse {

  //immutable
  private final String owner;
  private final int doors;
  private final int windows;
  private final double cost;
  private final boolean pool;
  private final boolean garage;
  //...


  // Weeeeeeeeery bad if was public
  private FinalHouse(String owner, int doors, int windows, double cost, boolean pool,
    boolean garage) {
    this.owner = owner;
    this.doors = doors;
    this.windows = windows;
    this.cost = cost;
    this.pool = pool;
    this.garage = garage;
  }
  //Getters

  public String getOwner() {
    return owner;
  }

  public int getDoors() {
    return doors;
  }

  public int getWindows() {
    return windows;
  }

  public double getCost() {
    return cost;
  }

  public boolean isPool() {
    return pool;
  }

  public boolean isGarage() {
    return garage;
  }


  //Our STATIC inner Builder
  static class Builder {

    private String owner;
    private int doors = 1;
    private int windows = 4;
    private double cost = 200;
    private boolean pool = false;
    private boolean garage = false;

    public Builder(String owner) {
      this.owner = owner;
    }

    //Setters

    public Builder setDoors(int doors) {
      this.doors = doors;
      return this;
    }

    public Builder setWindows(int windows) {
      this.windows = windows;
      return this;
    }

    public Builder setCost(double cost) {
      this.cost = cost;
      return this;
    }

    public Builder setPool(boolean pool) {
      this.pool = pool;
      return this;
    }

    public Builder setGarage(boolean garage) {
      this.garage = garage;
      return this;
    }

    public FinalHouse build() {
      return new FinalHouse(owner, doors, windows, cost, pool, garage);
    }
  }
}
