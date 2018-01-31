package Behavioral.Command.Example.Commands;

import Behavioral.Command.Example.Receivers.Stereo;

public class StereoOff implements Command {

  private Stereo stereo;

  public StereoOff(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    stereo.setVolume(0);
    stereo.stereoOFF();
  }

  @Override
  public void undo() {
    stereo.stereoON();
  }

}
