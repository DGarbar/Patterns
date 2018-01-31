package Creational.Builder.Example.BuilderDirector;

import Creational.Builder.Example.BuilderDirector.Builders.Builder;
import Creational.Builder.Example.BuilderDirector.Builders.CheepBuilder;
import Creational.Builder.Example.BuilderDirector.Builders.RichBuilder;
import Creational.Builder.Example.BuilderDirector.Directors.Director;

//We can create individual interface for each directors(Bridge) but y menya lapki
public class Ex {

  public static void main(String[] args) {
    Builder cheap = new CheepBuilder();
    Builder rich = new RichBuilder();

    Director director = new Director(cheap);
    System.out.println(director.getBigHousePrice().toString());
    System.out.println(director.getBigHousePrice().toString());

    System.out.println(director.getSmallHousePrice().toString());

    director.changeBuilder(rich);
    System.out.println(director.getBigHousePrice().toString());

    System.out.println(director.getSmallHousePrice().toString());

  }

}
