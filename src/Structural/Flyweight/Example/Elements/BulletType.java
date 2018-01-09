package Structural.Flyweight.Example.Elements;

//Unchangeable parameters
public class BulletType {

  private final String sprite; //Some hardWeight element
  //...

  public BulletType(String sprite) {
    this.sprite = sprite;
  }

  public String getSprite() {
    return sprite;
  }
}
