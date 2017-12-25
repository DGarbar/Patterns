package Creational.Singleton.Example.ThreadSync;

public class Server {

  //JDK 5
  private static volatile Server ourInstance = new Server();

  //Thread save

  /*
  or we can do only
  public static synchronized getInstance()
  but this not good (we need synchronized only 1 time)
  */
  public static Server getInstance() {
    if (ourInstance == null) {
      synchronized (Server.class) {
        if (ourInstance == null) {
          ourInstance = new Server();
        }
      }
    }
    return ourInstance;
  }

  private Server() {
  }
}
