package Behavioral.Observer.Example.ComponentIsPublisher.Components;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {

  private List<Component> com = new ArrayList<>();

  public void addNotify(Component component) {
    com.add(component);
  }

  public void removeNotify(Component component) {
    com.remove(component);
  }

  public void notifyComponent() {
    com.forEach(Component::update);
  }

  public abstract void update();
}
