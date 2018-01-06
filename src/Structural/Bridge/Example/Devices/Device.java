package Structural.Bridge.Example.Devices;

public interface Device {

  int getVolume();

  void setVolume(int volume);

  int getChannel();

  void nextChannel();

  boolean isEnable();

  void disable();

  void enable();

}
