package Behavioral.Command.Example.Invoker;

import Behavioral.Command.Example.Commands.Command;

public class RemoteController {

  //We have only one Command slot
  private Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  //We delegation work to our Command

  public void pressButton() {
    command.execute();
  }

  public void pressUndoButton() {
    command.undo();
  }

  /*
   * We can also have stack instead of method undo in Command,
   * if we want to have history of events.
   * Also we can have state of Command :
   * Serializable in method store() and Deser. in load()
   */
}
