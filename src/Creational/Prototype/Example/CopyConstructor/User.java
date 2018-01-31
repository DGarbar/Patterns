package Creational.Prototype.Example.CopyConstructor;

//About initialization fields take care developer of the class

public class User {

  private String name;
  private int age;

  public User(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Copy constructor 
  public User(User nUser) {
    this(nUser.getName(), nUser.getAge());
  }

  // Another variant
  public static User getInstance(User nUser) {
    return new User(nUser.getName(), nUser.getAge());
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

}
