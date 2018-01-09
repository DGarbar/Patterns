package Structural.Flyweight.Example.Elements;

import java.util.HashMap;
import java.util.Map;

public class BulletFactory {

  private BulletFactory() {
  }

  //Also can use Set<>
  private static Map<String, BulletType> bullets = new HashMap<>();

  public static BulletType getBulletType(String name, String sprite) {
    BulletType bulletType = bullets.get(name);
    if (bulletType == null) {
      bulletType = new BulletType(sprite);
      bullets.put(name, bulletType);
    }
    return bulletType;
  }


}
