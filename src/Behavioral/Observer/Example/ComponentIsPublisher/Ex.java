package Behavioral.Observer.Example.ComponentIsPublisher;

import Behavioral.Observer.Example.ComponentIsPublisher.Components.BasementAlarm;
import Behavioral.Observer.Example.ComponentIsPublisher.Components.Component;
import Behavioral.Observer.Example.ComponentIsPublisher.Components.FirstAlarm;
import Behavioral.Observer.Example.ComponentIsPublisher.Components.FourthAlarm;
import Behavioral.Observer.Example.ComponentIsPublisher.Components.SecondAlarm;
import Behavioral.Observer.Example.ComponentIsPublisher.Components.ThirdAlarm;

//Can be Circle Notification (never stops)

//Single Responsibility is fucked up
public class Ex {

  public static void main(String[] args) {
    Component alarm0 = new BasementAlarm();
    Component alarm1 = new FirstAlarm();
    Component alarm2 = new SecondAlarm();
    Component alarm3 = new ThirdAlarm();
    Component alarm4 = new FourthAlarm();

    alarm1.addNotify(alarm0);
    alarm1.addNotify(alarm2);

    alarm2.addNotify(alarm3);
    alarm2.addNotify(alarm4);

    alarm2.notifyComponent();
    System.out.println("///////////////////////////");
    alarm1.notifyComponent();
  }

}
