package Structural.Proxy.Example.Protection_proxy.Account.Users;

public interface IUser {

  String getNick();

  String getStatus();

  int getRang();

  void setNick(String nick);

  void setStatus(String status);

  void upRang();
}
