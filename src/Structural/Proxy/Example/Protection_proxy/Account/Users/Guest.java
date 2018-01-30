package Structural.Proxy.Example.Protection_proxy.Account.Users;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//Proxy
public class Guest implements InvocationHandler {

  private IUser user;

  public Guest(IUser user) {
    this.user = user;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args)
    throws IllegalAccessException {
    try {
      if (method.getName().startsWith("get") || method.getName().equals("upRang") || method
        .getName().equals("toString")) {
        return method.invoke(user, args);
      } else if (method.getName().startsWith("set")) {
        throw new IllegalAccessException("You can't change not your's info");
      }
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    }
    //When we invoke another method, do nothing
    return null;
  }
}

