package Behavioral.Observer.Example.ComponentIsPublisher.Components;

public class BasementAlarm extends Component {

  @Override
  public void update() {
    System.out.println("Basement Alarm is working");
  }
}
