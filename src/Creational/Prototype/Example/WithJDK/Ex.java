package Creational.Prototype.Example.WithJDK;

import java.util.GregorianCalendar;

public class Ex {

  public static void main(String[] args) {
    User u1 = new User("u1", 23);
    User u2 = null;
    u1.setCalendar(new GregorianCalendar(1999, 2, 2));
    System.out.println(u1.toString());

    try {
      u2 = (User) u1.clone();
      //Different objects bc Calendar impl Cloneable
      u2.setAge(222);
      u2.setCalendar(new GregorianCalendar(1, 1, 1));
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }

    System.out.println("U1 ==  " + u1.toString());

    System.out.println("U2 ==  " + u2.toString());
  }
}
