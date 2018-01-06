package Structural.Proxy.Example.Protection_proxy.Account.Users;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Owner implements InvocationHandler {

  private IUser user;

  public Owner(IUser user) {
    this.user = user;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args)
    throws IllegalAccessException {
    try {
      if (method.getName().startsWith("get") || method.getName().startsWith("set") || method
        .getName().equals("toString")) {
        return method.invoke(user, args);
      } else if (method.getName().equals("upRang")) {
        throw new IllegalAccessException("You can't up rang");
      }
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    }
    //When we invoke another method, do nothing
    return null;
  }
}

