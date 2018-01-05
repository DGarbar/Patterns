package Structural.Proxy.Example.Cached_proxy.Object;

public class Image {

  private String name;
  private int size;

  public Image(String name, int size) {
    this.name = name;
    this.size = size;
  }

  public String getName() {
    return name;
  }

  public int getSize() {
    return size;
  }

  @Override
  public String toString() {
    return "Image{" +
      "name='" + name + '\'' +
      ", size=" + size +
      '}';
  }
}
