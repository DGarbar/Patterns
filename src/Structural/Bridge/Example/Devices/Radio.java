package Structural.Bridge.Example.Devices;

public class Radio implements Device {

  private int volume = 0;
  private int channel = 0;
  private boolean enable = false;

  @Override
  public int getVolume() {
    return volume;
  }

  @Override
  public void setVolume(int volume) {
    this.volume = volume;
  }

  @Override
  public int getChannel() {
    return channel;
  }

  @Override
  public void nextChannel() {
    System.out.println("Next channel on Radio");
    channel += 130;
  }

  @Override
  public boolean isEnable() {
    return enable;
  }

  @Override
  public void disable() {
    enable = false;
  }

  @Override
  public void enable() {
    enable = true;
  }
}
