package Structural.Flyweight.Example.Weapons;

import Structural.Flyweight.Example.Elements.Bullet;
import Structural.Flyweight.Example.Elements.BulletFactory;
import Structural.Flyweight.Example.Elements.BulletType;
import java.util.ArrayList;
import java.util.List;

public class m16 {

  private List<Bullet> bullets = new ArrayList<>();

  public void fire() {
    BulletType bulletType = BulletFactory.getBulletType("m16", "m16Sprite.png");
    Bullet bullet = new Bullet(200, bulletType);
    bullets.add(bullet);
    System.out.println("Bullet was eddit to game");
  }

}
