package Structural.Flyweight.Example.Elements;

//Changeable parameters
public class Bullet {

  private int speed;
  private BulletType bulletType;

  public Bullet(int speed, BulletType bulletType) {
    this.speed = speed;
    this.bulletType = bulletType;
  }

  public int getSpeed() {
    return speed;
  }

  public BulletType getBulletType() {
    return bulletType;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public void setBulletType(BulletType bulletType) {
    this.bulletType = bulletType;
  }
}
