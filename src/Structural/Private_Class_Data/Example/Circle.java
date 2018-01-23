package Structural.Private_Class_Data.Example;

public class Circle {

  private CircleData circleData;

  public Circle(double r, String color, String name) {
    circleData = new CircleData(r, color, name);
  }

  public double Circumference() {
    return 2 * circleData.getR() * Math.PI;
  }

  public double Diameter() {
    return this.circleData.getR() * 2;
  }

}
