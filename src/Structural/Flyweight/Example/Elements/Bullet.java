package Structural.Flyweight.Example.Elements;

//Changeable parameters
public class Bullet {

  private int speed;
  private BulletType bulletType;

  public Bullet(int speed, BulletType bulletType) {
    this.speed = speed;
    this.bulletType = bulletType;
  }
}
