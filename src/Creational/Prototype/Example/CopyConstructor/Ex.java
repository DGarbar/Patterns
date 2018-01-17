package Creational.Prototype.Example.CopyConstructor;

public class Ex {

  public static void main(String[] args) {
    User u1 = new User("u1", 20);

    User u2 = new User(u1);

    //Static Factory
    User u3 = User.getInstance(u1);
  }

}
