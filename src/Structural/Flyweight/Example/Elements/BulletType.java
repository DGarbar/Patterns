package Structural.Flyweight.Example.Elements;

//Unchangeable parameters
public class BulletType {

  //FINAL
  private final String sprite; //Some heavy elements
  //...

  public BulletType(String sprite) {
    this.sprite = sprite;
  }

  public String getSprite() {
    return sprite;
  }
}
