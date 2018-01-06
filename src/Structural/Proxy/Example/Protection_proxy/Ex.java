package Structural.Proxy.Example.Protection_proxy;

import Structural.Proxy.Example.Protection_proxy.Account.Users.Guest;
import Structural.Proxy.Example.Protection_proxy.Account.Users.IUser;
import Structural.Proxy.Example.Protection_proxy.Account.Users.Owner;
import Structural.Proxy.Example.Protection_proxy.Account.Users.User;
import java.lang.reflect.Proxy;

public class Ex {

  public static void main(String[] args) {
    Ex ex = new Ex();
    ex.accountTest();
  }

  public void accountTest() {
    IUser vlad = new User("Vlad", "Gay");
    IUser dima = getGuestProxy(vlad);
    vlad = getOwnerProxy(vlad);

    //!!! Be careful, do not wrap up Proxy in Proxy

    /*
    vlad = getOwnerProxy(vlad);
    IUser dima = getGuestProxy(vlad);
    */

    System.out.println(vlad.toString());

    vlad.setNick("Ivanovator");
    vlad.getRang();
    dima.getNick();
    dima.getStatus();

    System.out.println(vlad.toString());
    try {
      vlad.upRang();  //Can't

      dima.setStatus("loves Dima");  //Can't
    } catch (Exception e) {
      System.out.println("You need to have privileges");
    }

    dima.upRang();
    dima.upRang();
    dima.upRang();

    System.out.println(vlad.toString());


  }

  private IUser getOwnerProxy(IUser user) {

    return (IUser) Proxy.newProxyInstance(
      user.getClass().getClassLoader(),
      user.getClass().getInterfaces(),  //get All Interfaces which need implement
      new Owner(user));
  }

  private IUser getGuestProxy(IUser user) {

    return (IUser) Proxy.newProxyInstance(
      user.getClass().getClassLoader(),
      user.getClass().getInterfaces(),  //get All Interfaces which need implement
      new Guest(user));
  }
}
