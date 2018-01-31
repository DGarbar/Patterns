package Creational.Singleton.Example.ThreadSync;

//Thread save
public class Server {

  //JDK 5
  //Lazy loading

  private static volatile Server ourInstance;

  /*
  Or we can do only
  public static synchronized getInstance()
  but this have performance issue
  (we need synchronized only 1 time, not every getInstance())
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
