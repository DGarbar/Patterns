package Behavioral.Observer.Example.ComponentIsPublisher.Components;

public class FirstAlarm extends Component {

  @Override
  public void update() {
    System.out.println("First Alarm is Working");
  }
}
