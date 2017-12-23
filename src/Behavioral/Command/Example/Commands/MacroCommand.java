package Behavioral.Command.Example.Commands;

import java.util.HashSet;
import java.util.Set;

public class MacroCommand implements Command {

  private Set<Command> commandSet = new HashSet<>();

  public void addCommand(Command command) {
    commandSet.add(command);
  }

  @Override
  public void execute() {
    commandSet.forEach(Command::execute);
  }

  @Override
  public void undo() {
    commandSet.forEach(Command::undo);
  }
}
