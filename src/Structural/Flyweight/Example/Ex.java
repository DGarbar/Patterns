package Structural.Flyweight.Example;

import Structural.Flyweight.Example.Weapons.m16;

public class Ex {

  public static void main(String[] args) {
    m16 m16 = new m16();

    for (int i = 0; i < 100; i++) {
      m16.fire();
    }
  }

}
