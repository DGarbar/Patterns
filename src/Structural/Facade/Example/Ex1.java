package Structural.Facade.Example;

import Structural.Facade.Example.Facade.Computer;
import Structural.Facade.Example.Subsystem.Mather;
import Structural.Facade.Example.Subsystem.Proz;
import Structural.Facade.Example.Subsystem.Video_Card;

public class Ex1 {

  public static void main(String[] args) {
    // Init components
    Video_Card video_card = new Video_Card();
    Proz proz = new Proz();
    Mather mather = new Mather();

    Computer computer = new Computer(video_card, proz, mather);
    computer.computerOn();

    //some work
    computer.computerOff();
  }
}
