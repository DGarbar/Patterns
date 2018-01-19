package Behavioral.Memento.Example.StaticNestedMemento;

import java.util.Stack;

public class Caretaker {

  private final Stack<Creator.Memento> mementos = new Stack<>();

  public Creator.Memento getLastSave() {
    return mementos.peek();
  }

  public void addSave(Creator.Memento memento) {
    mementos.push(memento);
  }

  public void removeLastSave() {
    mementos.pop();
  }
}
