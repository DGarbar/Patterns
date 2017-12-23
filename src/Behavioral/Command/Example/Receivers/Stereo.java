package Behavioral.Command.Example.Receivers;

public class Stereo {

  private int volume;
  private boolean cd;
  private boolean on;

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public boolean isCd() {
    return cd;
  }

  public void setCd() {
    cd = true;
  }

  public boolean isOn() {
    return on;
  }

  public void stereoON() {
    on = true;
    System.out.println("Stereo is ON");
  }

  public void stereoOFF() {
    this.on = false;
    System.out.println("Stereo is OFF");
  }
}
