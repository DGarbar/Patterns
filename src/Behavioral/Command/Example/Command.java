package Behavioral.Command.Example;

import Behavioral.Command.Example.Commands.LightOn;
import Behavioral.Command.Example.Commands.MacroCommand;
import Behavioral.Command.Example.Commands.StereoOff;
import Behavioral.Command.Example.Commands.StereoOn;
import Behavioral.Command.Example.Invoker.RemoteController;
import Behavioral.Command.Example.Receivers.Light;
import Behavioral.Command.Example.Receivers.Stereo;

public class Command {

  public static void main(String[] args) {

    //Create Receivers
    Light kitchen = new Light("Kitchen");
    Light lounge = new Light("Lounge");
    Light hall = new Light("Hall");
    Stereo stereo = new Stereo();

    //Create MacroCommands
    MacroCommand partyCommand = new MacroCommand();
    partyCommand.addCommand(new StereoOn(stereo));
    partyCommand.addCommand(new LightOn(lounge));

    //Create Invoker
    RemoteController remoteController = new RemoteController();

    remoteController.setCommand(new StereoOn(stereo));
    remoteController.pressButton();
    remoteController.setCommand(new StereoOff(stereo));
    remoteController.pressButton();
    System.out.println("UNDO");
    remoteController.pressUndoButton();

    System.out.println("Party START");
    remoteController.setCommand(partyCommand);
    remoteController.pressButton();
    System.out.println("UNDO");
    remoteController.pressUndoButton();

  }
}

