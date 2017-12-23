package Behavioral.Command.Example.Commands;

import Behavioral.Command.Example.Receivers.Stereo;

public class StereoOn implements Command {

  private Stereo stereo;

  public StereoOn(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    stereo.stereoON();
    stereo.setCd();
    stereo.setVolume(12);
  }

  @Override
  public void undo() {
    stereo.stereoOFF();
  }
}
