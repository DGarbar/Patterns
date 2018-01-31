package Creational.Builder.Example.Inner;

// https://habrahabr.ru/post/244521/

/*
 объект, получаемый из такого билдера,
 не потокобезопасен из-за того,
 что поля в нем не объявлены как final.
*/

/*
   Метод build билдера возвращает один и тот же объект
   и если после его вызова продолжить выставлять поля через методы билдера,
   поля уже созданного объекта будут меняться
*/
public class ElegantHouse {

  private String owner;
  private int doors;
  private int windows;
  private double cost;
  private boolean pool;
  private boolean garage;
  //...


  // Weeeeeeeeery bad if was public
  private ElegantHouse() {
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

  public static Builder newBuilder() {
    return new ElegantHouse().new Builder();
  }

  //Our inner Builder
  class Builder {

    //if constructor was public
    //we can change parameters
    private Builder() {
    }

    //Setters

    public Builder setOwner(String owner) {
      ElegantHouse.this.owner = owner;
      return this;
    }

    public Builder setDoors(int doors) {
      ElegantHouse.this.doors = doors;
      return this;
    }

    public Builder setWindows(int windows) {
      ElegantHouse.this.windows = windows;
      return this;
    }

    public Builder setCost(double cost) {
      ElegantHouse.this.cost = cost;
      return this;
    }

    public Builder setPool(boolean pool) {
      ElegantHouse.this.pool = pool;
      return this;
    }

    public Builder setGarage(boolean garage) {
      ElegantHouse.this.garage = garage;
      return this;
    }

    /*
    Метод build билдера возвращает один и тот же объект
    и если после его вызова продолжить выставлять поля через методы билдера,
    поля уже созданного объекта будут меняться
    */
    public ElegantHouse build() {
      return ElegantHouse.this;
    }

    /*
    Если вы часто передаете билдер туда-сюда
    и переиспользуете его для повторной генерации объектов,
    Используйте:

    public ElegantHouse build(){
      ElegantHouse elegantHouse = new ElegantHouse();
      elegantHouse.owner = ElegantHouse.this.owner;
      elegantHouse.doors = ElegantHouse.this.doors;
      elegantHouse.cost = ElegantHouse.this.cost;
      elegantHouse.garage = ElegantHouse.this.garage;
      elegantHouse.pool = ElegantHouse.this.pool;
      elegantHouse.windows = ElegantHouse.this.windows;
      return elegantHouse;
    }
    */

  }
}
