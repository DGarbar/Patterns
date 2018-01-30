package Structural.Private_Class_Data.Example;

public class CircleData {

  private double R;
  private String color;
  private String name;
  //...

  public CircleData(double r, String color, String name) {
    R = r;
    this.color = color;
    this.name = name;
  }

  public double getR() {
    return R;
  }

  public String getColor() {
    return color;
  }

  public String getName() {
    return name;
  }

  //...
}
