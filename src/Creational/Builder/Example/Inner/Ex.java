package Creational.Builder.Example.Inner;

public class Ex {

  public static void main(String[] args) {

    //You can do like that, but this method have A LOT OF ISSUE

    ElegantHouse elegantHouse = ElegantHouse.newBuilder()
      .setCost(200)
      .setGarage(false)
      .setOwner("lol")
      .setWindows(3)
      .build();
  }

}
