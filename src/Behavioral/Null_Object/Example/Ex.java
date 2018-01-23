package Behavioral.Null_Object.Example;

import Behavioral.Null_Object.Example.Animals.Animal;
import Behavioral.Null_Object.Example.Animals.Cat;
import Behavioral.Null_Object.Example.Animals.Dog;
import Behavioral.Null_Object.Example.Animals.NullAnimal;
import java.util.Scanner;

public class Ex {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Animal animal;
    while (true) {
      System.out.println("Write down what animals do you want");
      String str = sc.next();
      switch (str) {
        case "Dog":
          animal = new Dog();
          break;
        case "Cat":
          animal = new Cat();
          break;
        default:
          animal = NullAnimal.getInstance();
      }
      animal.run();
      animal.voice();
    }
  }
}
