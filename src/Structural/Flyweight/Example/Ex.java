package Structural.Flyweight.Example;

import Structural.Flyweight.Example.Weapons.Gun;

public class Ex {

  public static void main(String[] args) {
    //Also can add Pistol ...
    Gun gun = new Gun();

    for (int i = 0; i < 100; i++) {
      gun.fire();
    }
  }

}
