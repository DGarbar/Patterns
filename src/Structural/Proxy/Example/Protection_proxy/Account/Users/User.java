package Structural.Proxy.Example.Protection_proxy.Account.Users;

public class User implements IUser {

  private String nick;
  private String status;
  private int rang = 0;

  public User(String nick, String status) {
    this.nick = nick;
    this.status = status;
  }

  public String getNick() {
    return nick;
  }

  public void setNick(String nick) {
    this.nick = nick;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public int getRang() {
    return rang;
  }

  public void upRang() {
    rang++;
  }

  @Override
  public String toString() {
    return "nick = '" + nick + '\'' +
      ", status='" + status + '\'' +
      ", rang=" + rang + '\n';
  }
}
