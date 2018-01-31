package Creational.Prototype.Example.WithJDK;

import java.util.Calendar;

//Have problem in use
public class User implements Cloneable {

  private String name;
  private int age;

  //For nested (deep clone)
  //All nested classes need to implements Cloneable
  private Calendar calendar;


  public User(String name, int age) {
    //Some heavy operation (to DataBase ...)
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Calendar getCalendar() {
    return calendar;
  }

  public void setCalendar(Calendar calendar) {
    this.calendar = calendar;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  @Override
  public String toString() {
    return "User{" +
      "name='" + name + '\'' +
      ", age=" + age +
      ", calendar=" + calendar.getTime() +
      '}';
  }
}
