package Behavioral.Observer.Example.ComponentIsPublisher.Components;

public class SecondAlarm extends Component {

  @Override
  public void update() {
    System.out.println("Second Alarm is working");
  }
}
